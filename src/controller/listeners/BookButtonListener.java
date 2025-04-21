package controller.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FileHandlerGUI;

public class BookButtonListener implements ActionListener {
    private FileHandlerGUI fileHandlerGUI;

    public BookButtonListener(FileHandlerGUI fileHandlerGUI) {
        this.fileHandlerGUI = fileHandlerGUI;
    }

    @Override
    public void actionPerformed(ActionEvent event){
        fileHandlerGUI.initializeBookTable();
    }
}
