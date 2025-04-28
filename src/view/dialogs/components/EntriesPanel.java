package view.dialogs.components;

import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EntriesPanel extends JPanel {
    private final String BOOK_ID_TEXT = "ID книги";
    private final String PERSON_ID_TEXT = "ID читателя";
    private final String ISSUE_DATE_TEXT = "Дата выдачи";
    private final String GIVEN_DATE_TEXT = "Дата сдачи";
    private final String INPUT_TEXT = "Добавить";

    private final int COLUMNS_COUNT = 2;
    private final int ROWS_COUNT = 5;
    private final int H_GAP = 5;
    private final int V_GAP = 5;

    private JComboBox<Integer> bookIDComboBox;
    private JComboBox<Integer> personIDComboBox;
    private JTextField issueDateTextField;
    private JTextField givenDateTextField;
    private JButton uploadButton;

    public EntriesPanel() {
        this.setLayout(new GridLayout(ROWS_COUNT, COLUMNS_COUNT, H_GAP, V_GAP));
    }

    public JComboBox<Integer> getBookIDComboBox() {
        return bookIDComboBox;
    }

    public JComboBox<Integer> getPersonIDComboBox() {
        return personIDComboBox;
    }

    public void setValuesBookIDComboBox(Integer[] arrayBookID) {
        DefaultComboBoxModel<Integer> bookIDComboBoxModel = new DefaultComboBoxModel<>(arrayBookID);
        bookIDComboBox.setModel(bookIDComboBoxModel);
    }

    public void setValuesPersonsIDComboBox(Integer[] arrayPersonID) {
        DefaultComboBoxModel<Integer> personIDComboBoxModel = new DefaultComboBoxModel<>(arrayPersonID);
        personIDComboBox.setModel(personIDComboBoxModel);
    }

    public JTextField getIssueDateTextField() {
        return issueDateTextField;
    }

    public JTextField getGivenDateTextField() {
        return givenDateTextField;
    }
    
    public JButton getUploadButton() {
        return uploadButton;
    }

    public void initializeEntriesPanel() {
        JLabel bookIDLabel = new JLabel(BOOK_ID_TEXT);
        bookIDComboBox = new JComboBox<>();

        JLabel personIDLabel = new JLabel(PERSON_ID_TEXT);
        personIDComboBox = new JComboBox<>();

        JLabel issueDateLabel = new JLabel(ISSUE_DATE_TEXT);
        issueDateTextField = new JTextField();

        JLabel givenDateLabel = new JLabel(GIVEN_DATE_TEXT);
        givenDateTextField = new JTextField();

        uploadButton = new JButton(INPUT_TEXT);

        this.add(bookIDLabel);
        this.add(bookIDComboBox);

        this.add(personIDLabel);
        this.add(personIDComboBox);

        this.add(issueDateLabel);
        this.add(issueDateTextField);

        this.add(givenDateLabel);
        this.add(givenDateTextField);

        this.add(uploadButton);
    }
}
