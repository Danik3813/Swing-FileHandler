package controller.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FileHandlerModel;
import view.FileHandlerGUI;

public class InputButtonListener implements ActionListener {
    private FileHandlerGUI fileHandlerGUI;
    private FileHandlerModel fileHandlerModel;

    public InputButtonListener(FileHandlerGUI fileHandlerGUI, FileHandlerModel fileHandlerModel) {
        this.fileHandlerGUI = fileHandlerGUI;
        this.fileHandlerModel = fileHandlerModel;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        fileHandlerGUI.getControlPanel().getInputForm().setVisible(true);
    }
}
