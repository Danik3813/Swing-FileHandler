import controller.FileHandlerController;
import model.FileHandlerModel;
import view.FileHandlerGUI;

public class Main {
    public final static String APPLICATION_NAME = "Библиотечный учёт";
    public final static int APPLICATION_FRAME_WIDTH = 700;
    public final static int APPLICATION_FRAME_HEIGHT = 500;
    public static void main(String[] args) throws Exception {
        FileHandlerModel fileHandlerModel = new FileHandlerModel();
        fileHandlerModel.initializeModel();

        var fileHandlerGUI = new FileHandlerGUI(APPLICATION_NAME, APPLICATION_FRAME_WIDTH, APPLICATION_FRAME_HEIGHT);
        fileHandlerGUI.initializeGUI();

        FileHandlerController fileHandlerController = new FileHandlerController(fileHandlerModel, fileHandlerGUI);
        fileHandlerController.defaultInitialization();
    }
}
