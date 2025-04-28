package view.dialogs;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import view.dialogs.components.BooksPanel;
import view.dialogs.components.EntriesPanel;
import view.dialogs.components.PersonsPanel;

public class InputForm extends JDialog {
    private final JTabbedPane inputTableForm;
    private final String BOOKS_NAME = "Книги";
    private final String PERSONS_NAME = "Читатели";
    private final String ENTRIES_NAME = "Ведомость";
    private BooksPanel booksPanel;
    private PersonsPanel personsPanel;
    private EntriesPanel entriesPanel;

    public InputForm(JFrame owner, String title, int width, int height) {
        super(owner, title, JDialog.ModalityType.APPLICATION_MODAL);
        this.setSize(width, height);
        inputTableForm = new JTabbedPane(JTabbedPane.TOP);
    }

    public BooksPanel getBooksPanel() {
        return booksPanel;
    }

    public PersonsPanel getPersonsPanel() {
        return personsPanel;
    }

    public EntriesPanel getEntriesPanel() {
        return entriesPanel;
    }

    public void initializeInputForm() {
        intitalizeBooksForm();
        initializePersonsForm();
        initializeEntriesForm();
        this.add(inputTableForm);
    }

    private void intitalizeBooksForm() {
        booksPanel = new BooksPanel();
        booksPanel.initializeBooksPanel();
        inputTableForm.addTab(BOOKS_NAME, booksPanel);
    }

    private void initializePersonsForm() {
        personsPanel = new PersonsPanel();
        personsPanel.initializePersonsPanel();
        inputTableForm.addTab(PERSONS_NAME, personsPanel);
    }

    private void initializeEntriesForm() {
        entriesPanel = new EntriesPanel();
        entriesPanel.initializeEntriesPanel();
        inputTableForm.addTab(ENTRIES_NAME, entriesPanel);
    }
}
