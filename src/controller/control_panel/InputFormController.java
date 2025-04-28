package controller.control_panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FileHandlerModel;
import model.entities.Book;
import model.entities.Entry;
import model.entities.Person;
import view.FileHandlerGUI;

public class InputFormController {
    private final FileHandlerGUI fileHandlerGUI;
    private final FileHandlerModel fileHandlerModel;

    public InputFormController(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void initializeListeners() {
        fileHandlerGUI.getControlPanel().getInputButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                fileHandlerGUI.getControlPanel().getInputForm().setVisible(true);
            }
        });

        setBookListener();
        setPersonsListener();
        setEntriesListener();
    }

    private void setBookListener() {
        fileHandlerGUI.getControlPanel().getInputForm().getBooksPanel().getUploadButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                // TODO: добавить проверку на регулярные выражения посредством утилитарных классов

                var booksPanel = fileHandlerGUI.getControlPanel().getInputForm().getBooksPanel();

                var ID = fileHandlerModel.getBookList().getNewID();
                var authorText = booksPanel.getAuthorTextField().getText();
                var bookNameText = booksPanel.getNameTextField().getText();
                var yearText = Integer.parseInt(booksPanel.getYearTextField().getText());
                var quantityText = Integer.parseInt(booksPanel.getCountTextField().getText());

                Book book = new Book(
                    ID, authorText, bookNameText, yearText, quantityText
                );

                fileHandlerModel.getBookList().push(book);

                fileHandlerGUI.getDataTablePane().getBookTableModel().addRow(new Object[] {
                    book.getID(),
                    book.getAuthor(),
                    book.getName(),
                    book.getWritingYear(),
                    book.getQuanitity()
                });
            }
        });
    }

    private void setPersonsListener() {
        fileHandlerGUI.getControlPanel().getInputForm().getPersonsPanel().getUploadButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                // TODO: добавить проверку на регулярные выражения посредством утилитарных классов

                var ID = fileHandlerModel.getPersonList().getNewID();
                var personName = fileHandlerGUI.getControlPanel().getInputForm().getPersonsPanel().getNameTextField().getText();
                var personSurname = fileHandlerGUI.getControlPanel().getInputForm().getPersonsPanel().getSurnameTextField().getText();
                var personPatronymic = fileHandlerGUI.getControlPanel().getInputForm().getPersonsPanel().getPatronymicTextField().getText();

                Person person = new Person(ID, personName, personSurname, personPatronymic);

                fileHandlerModel.getPersonList().push(person);
                fileHandlerGUI.getDataTablePane().getPersonTableModel().addRow(new Object[] {
                    person.getID(),
                    person.getName(),
                    person.getSurname(),
                    person.getPatronymic()
                });

                
            }
        });
    }

    private void setEntriesListener() {
        fileHandlerGUI.getControlPanel().getInputForm().getEntriesPanel().getUploadButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                // TODO: добавить проверку на регулярные выражения посредством утилитарных классов

                var entriesPanel = fileHandlerGUI.getControlPanel().getInputForm().getEntriesPanel();

                var ID = fileHandlerModel.getEntriesList().getNewID();
                var bookID = (Integer) entriesPanel.getBookIDComboBox().getSelectedItem();
                var personID = (Integer) entriesPanel.getPersonIDComboBox().getSelectedItem();
                var issueDate = entriesPanel.getIssueDateTextField().getText();
                var givenDate = entriesPanel.getGivenDateTextField().getText();

                Entry entry = new Entry(
                    ID, bookID, personID, issueDate, givenDate
                );

                // Добавить проверку на существование книги / человека по ID

                fileHandlerModel.getEntriesList().push(entry);

                fileHandlerGUI.getDataTablePane().getEntriesTableModel().addRow(new Object[] {
                    entry.getID(),
                    entry.getBookID(),
                    entry.getPersonID(),
                    entry.getIssueDate(),
                    entry.getGivenDate()
                });
            }
        });
    }
}
