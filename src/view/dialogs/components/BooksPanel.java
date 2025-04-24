package view.dialogs.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BooksPanel extends JPanel{
    private final String AUTHOR_TEXT = "Автор";
    private final String NAME_TEXT = "Название книги";
    private final String YEAR_TEXT = "Год издания";
    private final String COUNT_TEXT = "Количество на складе";
    private final String INPUT_TEXT = "Добавить";

    private final int COLUMNS_COUNT = 5;
    private final int ROWS_COUNT = 2;
    private final int H_GAP = 5;
    private final int V_GAP = 5;

    private JTextField authorTextField;
    private JTextField nameTextField;
    private JTextField yearTextField;
    private JTextField countTextField;
    private JButton uploadButton;

    public BooksPanel() {
        this.setLayout(new GridLayout(COLUMNS_COUNT, ROWS_COUNT, H_GAP, V_GAP));
    }

    public JTextField getAuthorTextField() {
        return authorTextField;
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getYearTextField() {
        return yearTextField;
    }

    public JTextField getCountTextField() {
        return countTextField;
    }

    public JButton getUploadButton() {
        return uploadButton;
    }

    public void initializeBooksPanel() {
        JLabel authorLabel = new JLabel(AUTHOR_TEXT);
        authorTextField = new JTextField();
        JLabel nameLabel = new JLabel(NAME_TEXT);
        nameTextField = new JTextField();
        JLabel yearLabel = new JLabel(YEAR_TEXT);
        yearTextField = new JTextField();
        JLabel countLabel = new JLabel(COUNT_TEXT);
        countTextField = new JTextField();

        this.add(authorLabel);
        this.add(authorTextField);

        this.add(nameLabel);
        this.add(nameTextField);
        
        this.add(yearLabel);
        this.add(yearTextField);

        this.add(countLabel);
        this.add(countTextField);

        uploadButton = new JButton(INPUT_TEXT);
        this.add(uploadButton);
    }
}
