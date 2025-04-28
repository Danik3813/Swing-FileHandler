package view.components;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import view.dialogs.InputForm;

public class ControlPanel extends JPanel {
    private final String INPUT_TEXT = "Добавить";
    private final String SAVE_TEXT = "Сохранить";
    private final String SEARCH_TEXT = "Поиск";
    private final String STATISTIC_TEXT = "Статистика";
    private final String DELETE_TEXT = "Удалить запись";

    private InputForm inputForm;
    private JButton inputButton;
    private JButton saveButton;
    private JButton searchButton;
    private JButton statButton;
    private JButton deleteButton;

    public ControlPanel(JFrame owner) {
        this.setLayout(new GridLayout(1, 5, 5, 5));
        inputForm = new InputForm(owner, "Добавление данных", 300, 300);
    }

    public JButton getInputButton() {
        return inputButton;
    }

    public InputForm getInputForm() {
        return inputForm;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JButton getStatButton() {
        return statButton;
    }

    public JButton getDeleteButton() {
        return deleteButton;
    }
    
    public void initializeControlPanel() {
        inputForm.initializeInputForm();
        inputButton = new JButton(INPUT_TEXT);
        saveButton = new JButton(SAVE_TEXT);
        searchButton = new JButton(SEARCH_TEXT);;
        statButton = new JButton(STATISTIC_TEXT);
        deleteButton = new JButton(DELETE_TEXT);
    
        this.add(searchButton);
        this.add(statButton);
        this.add(inputButton);
        this.add(saveButton);
        this.add(deleteButton);
    }
}
