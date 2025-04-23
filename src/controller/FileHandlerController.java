package controller;

import controller.listeners.InputButtonListener;
import model.FileHandlerModel;
import model.entities.Book;
import model.entities.Entry;
import model.entities.Person;
import view.FileHandlerGUI;

public class FileHandlerController {
    private FileHandlerModel fileHandlerModel;
    private FileHandlerGUI fileHandlerGUI;

    public FileHandlerController(FileHandlerModel fileHandlerModel, FileHandlerGUI fileHandlerGUI) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void defaultInitialization() {
        uploadData();
        initializeListeners();
    }

    private void uploadData() {
        var books = fileHandlerModel.getBookList().getEntities();

        for (Book book : books) {
            fileHandlerGUI.getDataTablePane().getBookTableModel().addRow(new Object[] {
                book.getID(),
                book.getAuthor(),
                book.getName(),
                book.getWritingYear(),
                book.getQuanitity()
            });
        }

        var persons = fileHandlerModel.getPersonList().getEntities();
        
        for (Person person : persons) {
            fileHandlerGUI.getDataTablePane().getPersonTableModel().addRow(new Object[] {
                person.getID(),
                person.getName(),
                person.getSurname(),
                person.getPatronymic()
            });
        }

        var entries = fileHandlerModel.getEntriesList().getEntities();

        for (Entry entry : entries) {
            fileHandlerGUI.getDataTablePane().getEntriesTableModel().addRow(new Object[] {
                entry.getID(),
                entry.getBookID(),
                entry.getPersonID(),
                entry.getIssueDate(),
                entry.getGivenDate()
            });
        }
    }

    private void initializeListeners() {
        fileHandlerGUI.getControlPanel().getInputButton().addActionListener(new InputButtonListener(fileHandlerGUI, fileHandlerModel));
    }
}
