package view.components;

import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import view.TableHeaders;

public class DataTablePane extends JTabbedPane {
    private EntityTableModel bookTableModel;
    private EntityTableModel personTableModel;
    private EntityTableModel entriesTableModel;

    public final static String BOOKS_NAME = "Книги";
    public final static String PERSONS_NAME = "Читатели";
    public final static String ENTRIES_NAME = "Ведомость";

    public DataTablePane() {
        tabPlacement = JTabbedPane.TOP;
    }

    public void initializeDataTablePane() {
        bookTableModel = new EntityTableModel(TableHeaders.BOOKS_HEADER.getHeaders());
        JTable bookTable = new JTable(bookTableModel);
        JScrollPane bookScrollPane = new JScrollPane(bookTable);
        this.addTab(BOOKS_NAME, bookScrollPane);

        personTableModel = new EntityTableModel(TableHeaders.PERSONS_HEADER.getHeaders());
        JTable personTable = new JTable(personTableModel);
        JScrollPane personScrollPane = new JScrollPane(personTable);
        this.addTab(PERSONS_NAME, personScrollPane);

        entriesTableModel = new EntityTableModel(TableHeaders.ENTRIES_HEADER.getHeaders());
        JTable entryTable = new JTable(entriesTableModel);
        JScrollPane entryScrollPane = new JScrollPane(entryTable);
        this.addTab(ENTRIES_NAME, entryScrollPane);
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
}
