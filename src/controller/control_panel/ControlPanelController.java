package controller.control_panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FileHandlerModel;
import view.FileHandlerGUI;

public class ControlPanelController {
    private final FileHandlerGUI fileHandlerGUI;
    private final FileHandlerModel fileHandlerModel;

    public ControlPanelController(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }
    
    public void initializeControlPanelControllers() {
        // Установка контроллера статистики данных
        StatFormController statFormController = new StatFormController(fileHandlerGUI, fileHandlerModel);
        statFormController.initializeListeners();

        // Инициализация контроллера поиска данных
        SearchFormController searchFormController = new SearchFormController(fileHandlerGUI, fileHandlerModel);
        searchFormController.initializeListeners();

        // Инициализация контроллера добавления новых данных на форму
        InputFormController inputFormController = new InputFormController(fileHandlerGUI, fileHandlerModel);
        inputFormController.initializeListeners();

        // Установка слушателя события на кнопку сохранения данных
        fileHandlerGUI.getControlPanel().getSaveButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event){
                fileHandlerModel.saveModel();
            }
        });

        // TODO: решить проблему с ВЫНЕСЕНИЕМ DELETE_BUTTON в DATATABLECONTROLLER
    }
}
