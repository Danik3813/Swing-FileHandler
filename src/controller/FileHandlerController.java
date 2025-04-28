package controller;

import java.util.ArrayList;
import java.util.List;

import controller.control_panel.ControlPanelController;
import controller.data_table.DataTableController;
import model.FileHandlerModel;
import model.entities.Book;
import model.entities.Entry;
import model.entities.Person;
import view.FileHandlerGUI;

public class FileHandlerController {
    private FileHandlerModel fileHandlerModel;
    private FileHandlerGUI fileHandlerGUI;

    public FileHandlerController(FileHandlerModel fileHandlerModel, FileHandlerGUI fileHandlerGUI) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void defaultInitialization() {
        uploadData();
        initializeListeners();
    }

    private void uploadData() {
        var books = fileHandlerModel.getBookList().getEntities();
        List<Integer> listBookID = new ArrayList<>();

        for (Book book : books) {
            listBookID.add(book.getID());
            fileHandlerGUI.getDataTablePane().getBookTableModel().addRow(new Object[] {
                book.getID(),
                book.getAuthor(),
                book.getName(),
                book.getWritingYear(),
                book.getQuanitity()
            });
        }

        var persons = fileHandlerModel.getPersonList().getEntities();
        List<Integer> listPersonID = new ArrayList<>();
        
        for (Person person : persons) {
            listPersonID.add(person.getID());
            fileHandlerGUI.getDataTablePane().getPersonTableModel().addRow(new Object[] {
                person.getID(),
                person.getName(),
                person.getSurname(),
                person.getPatronymic()
            });
        }

        var entries = fileHandlerModel.getEntriesList().getEntities();

        for (Entry entry : entries) {
            fileHandlerGUI.getDataTablePane().getEntriesTableModel().addRow(new Object[] {
                entry.getID(),
                entry.getBookID(),
                entry.getPersonID(),
                entry.getIssueDate(),
                entry.getGivenDate()
            });
        }

        Integer[] arrayBookID = listBookID.toArray(new Integer[0]);
        fileHandlerGUI.getControlPanel().getInputForm().getEntriesPanel().setValuesBookIDComboBox(arrayBookID);

        Integer[] arrayPersonID = listPersonID.toArray(new Integer[0]);
        fileHandlerGUI.getControlPanel().getInputForm().getEntriesPanel().setValuesPersonsIDComboBox(arrayPersonID);
    }

    private void initializeListeners() {
        // Контроллер панели управления (поиск, статистика, добавление, сохранение)
        ControlPanelController controlPanelController = new ControlPanelController(fileHandlerGUI, fileHandlerModel);
        controlPanelController.initializeControlPanelControllers();
        
        // Контроллер таблицы данных (DataTablePane)
        DataTableController dataTableController = new DataTableController(fileHandlerGUI, fileHandlerModel);
        dataTableController.initializeListeners();
    }
}
