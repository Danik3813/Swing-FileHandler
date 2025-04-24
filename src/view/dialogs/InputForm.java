package view.dialogs;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import view.dialogs.components.BooksPanel;

public class InputForm extends JDialog {
    private final static JTabbedPane inputTableForm = new JTabbedPane(JTabbedPane.TOP);
    private BooksPanel booksPanel;

    public InputForm(JFrame owner, String title, int width, int height) {
        super(owner, title, JDialog.ModalityType.APPLICATION_MODAL);
        this.setSize(width, height);
    }

    public BooksPanel getBooksPanel() {
        return booksPanel;
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
        inputTableForm.addTab("Книги", booksPanel);
    }

    private void initializePersonsForm() {
        final String NAME_TEXT = "Имя";
        final String SURNAME_TEXT = "Фамилия";
        final String PATRONYMIC_TEXT = "Отчество";

        JPanel personsForm = new JPanel(new GridLayout(4, 2, 5, 5));
        JLabel nameLabel = new JLabel(NAME_TEXT);
        JTextField nameTextField = new JTextField();
        JLabel surnameLabel = new JLabel(SURNAME_TEXT);
        JTextField surnameTextField = new JTextField();
        JLabel patronymicLabel = new JLabel(PATRONYMIC_TEXT);
        JTextField patronymicTextField = new JTextField();

        personsForm.add(nameLabel);
        personsForm.add(nameTextField);

        personsForm.add(surnameLabel);
        personsForm.add(surnameTextField);

        personsForm.add(patronymicLabel);
        personsForm.add(patronymicTextField);

        personsForm.add(new JButton("Добавить"));

        inputTableForm.addTab("Читатели", personsForm);
    }

    private void initializeEntriesForm() {
        final String BOOK_ID_TEXT = "ID книги";
        final String PERSON_ID_TEXT = "ID читателя";
        final String ISSUE_DATE_TEXT = "Дата выдачи";
        final String GIVEN_DATE_TEXT = "Дата сдачи";
        // final String ACTUAL_GIVEN_DATE_TEXT = "Дата фактической сдачи";

        JPanel entriesForm = new JPanel(new GridLayout(5, 2, 5, 5));

        JLabel bookIDLabel = new JLabel(BOOK_ID_TEXT);
        Integer[] arrayBookID = {1, 2, 3};
        JComboBox<Integer> bookIDComboBox = new JComboBox<>(arrayBookID);

        JLabel personIDLabel = new JLabel(PERSON_ID_TEXT);
        Integer[] arrayPersonID = {1, 2, 3, 4};
        JComboBox<Integer> personIDComboBox = new JComboBox<>(arrayPersonID);

        JLabel issueDateLabel = new JLabel(ISSUE_DATE_TEXT);
        JTextField issueDateTextField = new JTextField();

        JLabel givenDateLabel = new JLabel(GIVEN_DATE_TEXT);
        JTextField givenDateTextField = new JTextField();

        entriesForm.add(bookIDLabel);
        entriesForm.add(bookIDComboBox);

        entriesForm.add(personIDLabel);
        entriesForm.add(personIDComboBox);

        entriesForm.add(issueDateLabel);
        entriesForm.add(issueDateTextField);

        entriesForm.add(givenDateLabel);
        entriesForm.add(givenDateTextField);

        entriesForm.add(new JButton("Добавить"));

        inputTableForm.addTab("Ведомость", entriesForm);
    }
}
