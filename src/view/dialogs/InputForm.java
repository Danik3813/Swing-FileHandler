package view.dialogs;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class InputForm extends JDialog {
    private final static JTabbedPane inputTableForm = new JTabbedPane(JTabbedPane.TOP);

    public InputForm(JFrame owner, String title, int width, int height) {
        super(owner, title, JDialog.ModalityType.APPLICATION_MODAL);
        this.setSize(width, height);
    }

    public void initializeInputForm() {
        intitalizeBooksForm();
        initializePersonsForm();
        initializeEntriesForm();
        this.add(inputTableForm);
    }

    private void intitalizeBooksForm() {
        JPanel booksForm = new JPanel(new GridLayout(5, 2, 5, 5));
        JLabel authorLabel = new JLabel("Автор");
        JTextField authorTextField = new JTextField();
        JLabel nameLabel = new JLabel("Название книги");
        JTextField nameTextField = new JTextField();
        JLabel yearLabel = new JLabel("Год издания");
        JTextField yearTextField = new JTextField();
        JLabel countLabel = new JLabel("Количество на складе");
        JTextField countTextField = new JTextField();

        booksForm.add(authorLabel);
        booksForm.add(authorTextField);

        booksForm.add(nameLabel);
        booksForm.add(nameTextField);
        
        booksForm.add(yearLabel);
        booksForm.add(yearTextField);

        booksForm.add(countLabel);
        booksForm.add(countTextField);

        booksForm.add(new JButton("Добавить"));

        inputTableForm.addTab("Книги", booksForm);
    }

    private void initializePersonsForm() {

    }

    private void initializeEntriesForm() {

    }
}
