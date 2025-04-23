package view.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.dialogs.InputForm;

public class ControlPanel extends JPanel {
    private final static String INPUT_TEXT = "Добавить";
    private final static String SAVE_TEXT = "Сохранить";
    private final static String SEARCH_TEXT = "Поиск";
    private final static String STATISTIC_TEXT = "Статистика";
    
    private InputForm inputForm;
    private JButton inputButton;

    public ControlPanel(JFrame owner) {
        this.setLayout(new GridLayout(1, 4, 5, 5));
        inputForm = new InputForm(owner, "Добавление данных", 300, 300);
    }

    public JButton getInputButton() {
        return inputButton;
    }

    public InputForm getInputForm() {
        return inputForm;
    }

    public void initializeControlPanel() {
        inputForm.initializeInputForm();
        inputButton = new JButton(INPUT_TEXT);
        JButton saveButton = new JButton(SAVE_TEXT);
        JButton searchButton = new JButton(SEARCH_TEXT);;
        JButton statButton = new JButton(STATISTIC_TEXT);
    
        this.add(searchButton);
        this.add(statButton);
        this.add(inputButton);
        this.add(saveButton);
    }
}
