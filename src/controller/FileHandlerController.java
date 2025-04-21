package controller;

import model.FileHandlerModel;
import model.entities.Book;
import view.FileHandlerGUI;

public class FileHandlerController {
    private FileHandlerModel fileHandlerModel;
    private FileHandlerGUI fileHandlerGUI;

    public FileHandlerController(FileHandlerModel fileHandlerModel, FileHandlerGUI fileHandlerGUI) {
        this.fileHandlerModel = fileHandlerModel;
        this.fileHandlerGUI = fileHandlerGUI;
    }

    public void defaultInitialization() {
        var books = fileHandlerModel.getBookList().getEntities();

        for (Book book : books) {
            fileHandlerGUI.getBookTableModel().addRow(new Object[] {
                    book.getID(),
                    book.getAuthor(),
                    book.getName(),
                    book.getWritingYear(),
                    book.getQuanitity()
                }
            );
        }
    }
}
