package controller.control_panel;

import model.FileHandlerModel;
import view.FileHandlerGUI;

public class SearchFormController {
    private final FileHandlerGUI fileHandlerGUI;
    private final FileHandlerModel fileHandlerModel;

    public SearchFormController(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void initializeListeners() {
        
    }
}
