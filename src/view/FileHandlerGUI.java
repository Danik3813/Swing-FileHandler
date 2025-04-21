package view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.listeners.BookButtonListener;

public class FileHandlerGUI extends JFrame {
    private EntityTableModel bookTableModel;
    private EntityTableModel personTableModel;
    private EntityTableModel entriesTableModel;

    public FileHandlerGUI(String title) {
        super(title);
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

    public void initializeGUI(int width, int height) {
        setSize(width, height);
        this.setLayout(new GridBagLayout());

        // Инициализация компонентов окна
        initializeControlPanel();
        initializeBookTable();
        initializeInputPanel();
        initializeFeaturesPanel();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initializeControlPanel() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 0;
        gridManager.weightx = 1.0; gridManager.weighty = 0.1;

        final String BOOKS_NAME = "Книги";
        final String PERSONS_NAME = "Читатели";
        final String ENTRIES_NAME = "Ведомость";

        JButton booksButton = new JButton(BOOKS_NAME);
        booksButton.addActionListener(new BookButtonListener(this));
        JButton personsButton = new JButton(PERSONS_NAME);
        JButton entriesButton = new JButton(ENTRIES_NAME);
        JPanel controlPanel = new JPanel(new GridLayout(1, 3, 5, 0));

        controlPanel.add(booksButton);
        controlPanel.add(personsButton);
        controlPanel.add(entriesButton);

        this.add(controlPanel, gridManager);
    }

    public void initializeBookTable() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 1;
        gridManager.weightx = 1.0; gridManager.weighty = 0.5;
        gridManager.fill = GridBagConstraints.BOTH;

        bookTableModel = new EntityTableModel(TableHeaders.BOOKS_HEADER);
        JTable bookTable = new JTable(bookTableModel);
        bookTable.getTableHeader().setReorderingAllowed(false);

        JScrollPane bookScrollPane = new JScrollPane(bookTable);
        this.add(bookScrollPane, gridManager);
    }

    public void initializePersonTable() {
        // Инициализация менеджера расположения
        GridBagConstraints gridManager = new GridBagConstraints();
        gridManager.gridx = 0; gridManager.gridy = 1;
        gridManager.weightx = 1.0; gridManager.weighty = 0.5;
        gridManager.fill = GridBagConstraints.BOTH;

        personTableModel = new EntityTableModel(TableHeaders.PERSONS_HEADER);
        JTable personTable = new JTable(personTableModel);

        JScrollPane personScrollPane = new JScrollPane(personTable);
        this.add(personScrollPane, gridManager);
    } 

    private void initializeInputPanel() {

    }

    private void initializeFeaturesPanel() {

    }
}
