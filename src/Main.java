import controller.FileHandlerController;
import model.FileHandlerModel;
import view.FileHandlerGUI;

public class Main {
    public static void main(String[] args) throws Exception {
        FileHandlerModel fileHandlerModel = new FileHandlerModel();
        fileHandlerModel.initializeModel();

        var fileHandlerGUI = new FileHandlerGUI("Библиотечный учёт");
        fileHandlerGUI.initializeGUI(600, 600);

        FileHandlerController fileHandlerController = new FileHandlerController(fileHandlerModel, fileHandlerGUI);
        fileHandlerController.defaultInitialization();
    }
}
