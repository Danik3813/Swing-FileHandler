package controller.control_panel;

import model.FileHandlerModel;
import view.FileHandlerGUI;

public class StatFormController {
    private final FileHandlerGUI fileHandlerGUI;
    private final FileHandlerModel fileHandlerModel;

    public StatFormController(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void initializeListeners() {
        
    }
}
