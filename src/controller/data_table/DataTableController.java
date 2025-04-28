package controller.data_table;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FileHandlerModel;
import view.FileHandlerGUI;

public class DataTableController {
    private final FileHandlerGUI fileHandlerGUI;
    private final FileHandlerModel fileHandlerModel;

    public DataTableController(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerGUI = fileHandlerGUI;
        this.fileHandlerModel = fileHandlerModel;
    }

    public void initializeListeners() {
        initializeBookTableListeners();
        initializePersonTableListeners();
        initializeEntryTableListeners();
    }
    
    private void initializeBookTableListeners() {
        var bookTableModel = fileHandlerGUI.getDataTablePane().getBookTableModel();
        var deleteButton = fileHandlerGUI.getControlPanel().getDeleteButton();

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int selectedRow = fileHandlerGUI.getDataTablePane().getBookTable().getSelectedRow();
                int selectedIndex = fileHandlerGUI.getDataTablePane().getSelectedIndex();
                if (selectedRow != -1 && selectedIndex == 0) {
                    bookTableModel.removeRow(selectedRow);
                    fileHandlerModel.getBookList().getEntities().remove(selectedRow);
                }
            }
        });
    }

    private void initializePersonTableListeners() {
        var personTableModel = fileHandlerGUI.getDataTablePane().getPersonTableModel();
        var deleteButton = fileHandlerGUI.getControlPanel().getDeleteButton();

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int selectedRow = fileHandlerGUI.getDataTablePane().getPersonTable().getSelectedRow();
                int selectedIndex = fileHandlerGUI.getDataTablePane().getSelectedIndex();
                if (selectedRow != -1 && selectedIndex == 1) {
                    personTableModel.removeRow(selectedRow);
                    fileHandlerModel.getPersonList().getEntities().remove(selectedRow);
                }
            }
        });
    }

    private void initializeEntryTableListeners() {
        var entryTableModel = fileHandlerGUI.getDataTablePane().getEntriesTableModel();
        var deleteButton = fileHandlerGUI.getControlPanel().getDeleteButton();

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                int selectedRow = fileHandlerGUI.getDataTablePane().getEntryTable().getSelectedRow();
                int selectedIndex = fileHandlerGUI.getDataTablePane().getSelectedIndex();
                if (selectedRow != -1 && selectedIndex == 2) {
                    entryTableModel.removeRow(selectedRow);
                    fileHandlerModel.getEntriesList().getEntities().remove(selectedRow);
                }
            }
        });
    }
}
