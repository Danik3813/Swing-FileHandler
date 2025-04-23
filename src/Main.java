import controller.FileHandlerController;
import model.FileHandlerModel;
import view.FileHandlerGUI;

public class Main {
    public static void main(String[] args) throws Exception {
        FileHandlerModel fileHandlerModel = new FileHandlerModel();
        fileHandlerModel.initializeModel();

        var fileHandlerGUI = new FileHandlerGUI("Библиотечный учёт", 700, 500);
        fileHandlerGUI.initializeGUI();

        FileHandlerController fileHandlerController = new FileHandlerController(fileHandlerModel, fileHandlerGUI);
        fileHandlerController.defaultInitialization();
    }
}
