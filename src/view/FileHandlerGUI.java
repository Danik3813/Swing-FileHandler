package view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dialog;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.listeners.BookButtonListener;
import view.dialogs.InputForm;

public class FileHandlerGUI extends JFrame {
    private EntityTableModel bookTableModel;
    private EntityTableModel personTableModel;
    private EntityTableModel entriesTableModel;
    private final static JTabbedPane tablePane = new JTabbedPane(JTabbedPane.TOP);

    public FileHandlerGUI(String title, int width, int height) {
        super(title);
        this.setSize(width, height);
    }

    public EntityTableModel getBookTableModel() {
        return bookTableModel;
    }

    public EntityTableModel getPersonTableModel() {
        return personTableModel;
    }

    public EntityTableModel getEntriesTableModel() {
        return entriesTableModel;
    }

    public void initializeGUI() {
        this.setLayout(new GridBagLayout());

        // Инициализация компонентов окна
        initializeDataTablePane();
        initializeControlPanel();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeDataTablePane() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 0;
        gridManager.weightx = 1.0; gridManager.weighty = 0.8;
        gridManager.fill = GridBagConstraints.BOTH;

        final String BOOKS_NAME = "Книги";
        final String PERSONS_NAME = "Читатели";
        final String ENTRIES_NAME = "Ведомость";

        bookTableModel = new EntityTableModel(TableHeaders.BOOKS_HEADER);
        JTable bookTable = new JTable(bookTableModel);
        JScrollPane bookScrollPane = new JScrollPane(bookTable);
        tablePane.addTab(BOOKS_NAME, bookScrollPane);

        personTableModel = new EntityTableModel(TableHeaders.PERSONS_HEADER);
        JTable personTable = new JTable(personTableModel);
        JScrollPane personScrollPane = new JScrollPane(personTable);
        tablePane.addTab(PERSONS_NAME, personScrollPane);

        entriesTableModel = new EntityTableModel(TableHeaders.ENTRIES_HEADER);
        JTable entryTable = new JTable(entriesTableModel);
        JScrollPane entryScrollPane = new JScrollPane(entryTable);
        tablePane.addTab(ENTRIES_NAME, entryScrollPane);

        this.add(tablePane, gridManager);
    }

    private void initializeControlPanel() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 1;
        gridManager.weightx = 1.0; gridManager.weighty = 0.2;

        final String INPUT_TEXT = "Добавить";
        final String SAVE_TEXT = "Сохранить";
        final String SEARCH_TEXT = "Поиск";
        final String STATISTIC_TEXT = "Статистика";

        InputForm inputForm = new InputForm(this, "Добавление данных", 300, 300);
        inputForm.initializeInputForm();

        JButton inputButton = new JButton(INPUT_TEXT);
        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                inputForm.setVisible(true);
            }
        });
        JButton saveButton = new JButton(SAVE_TEXT);
        JButton searchButton = new JButton(SEARCH_TEXT);;
        JButton statButton = new JButton(STATISTIC_TEXT);
        
        JPanel controlPanel = new JPanel(new GridLayout(1, 4, 5, 5));
        controlPanel.add(searchButton);
        controlPanel.add(statButton);
        controlPanel.add(inputButton);
        controlPanel.add(saveButton);

        this.add(controlPanel, gridManager);
    }
}
