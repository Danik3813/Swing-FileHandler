package view.components;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class DataTablePane extends JTabbedPane {
    private EntityTableModel bookTableModel;
    private EntityTableModel personTableModel;
    private EntityTableModel entriesTableModel;

    private JTable bookTable;
    private JTable personTable;
    private JTable entryTable;

    public final static String BOOKS_NAME = "Книги";
    public final static String PERSONS_NAME = "Читатели";
    public final static String ENTRIES_NAME = "Ведомость";

    public DataTablePane() {
        tabPlacement = JTabbedPane.TOP;
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

    public JTable getBookTable() {
        return bookTable;
    }

    public JTable getPersonTable() {
        return personTable;
    }

    public JTable getEntryTable() {
        return entryTable;
    }

    public void initializeDataTablePane() {
        bookTableModel = new EntityTableModel(TableHeaders.BOOKS_HEADER.getHeaders());
        bookTable = new JTable(bookTableModel);
        bookTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane bookScrollPane = new JScrollPane(bookTable);
        this.addTab(BOOKS_NAME, bookScrollPane);

        personTableModel = new EntityTableModel(TableHeaders.PERSONS_HEADER.getHeaders());
        personTable = new JTable(personTableModel);
        personTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane personScrollPane = new JScrollPane(personTable);
        this.addTab(PERSONS_NAME, personScrollPane);

        entriesTableModel = new EntityTableModel(TableHeaders.ENTRIES_HEADER.getHeaders());
        entryTable = new JTable(entriesTableModel);
        entryTable.getTableHeader().setReorderingAllowed(false);
        JScrollPane entryScrollPane = new JScrollPane(entryTable);
        this.addTab(ENTRIES_NAME, entryScrollPane);
    }   
}
