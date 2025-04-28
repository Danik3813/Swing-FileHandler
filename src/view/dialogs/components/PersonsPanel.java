package view.dialogs.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PersonsPanel extends JPanel {
    private final String NAME_TEXT = "Имя";
    private final String SURNAME_TEXT = "Фамилия";
    private final String PATRONYMIC_TEXT = "Отчество";
    private final String INPUT_TEXT = "Добавить";

    private final int COLUMNS_COUNT = 2;
    private final int ROWS_COUNT = 4;
    private final int H_GAP = 5;
    private final int V_GAP = 5;

    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField patronymicTextField;
    private JButton uploadButton;

    public PersonsPanel() {
        this.setLayout(new GridLayout(ROWS_COUNT, COLUMNS_COUNT, H_GAP, V_GAP));
    }

    public JTextField getNameTextField() {
        return nameTextField;
    }

    public JTextField getSurnameTextField() {
        return surnameTextField;
    }

    public JTextField getPatronymicTextField() {
        return patronymicTextField;
    }

    public JButton getUploadButton() {
        return uploadButton;
    }

    public void initializePersonsPanel() {
        JLabel nameLabel = new JLabel(NAME_TEXT);
        nameTextField = new JTextField();
        JLabel surnameLabel = new JLabel(SURNAME_TEXT);
        surnameTextField = new JTextField();
        JLabel patronymicLabel = new JLabel(PATRONYMIC_TEXT);
        patronymicTextField = new JTextField();

        uploadButton = new JButton(INPUT_TEXT);

        this.add(nameLabel);
        this.add(nameTextField);

        this.add(surnameLabel);
        this.add(surnameTextField);

        this.add(patronymicLabel);
        this.add(patronymicTextField);

        this.add(uploadButton);
    }
}
