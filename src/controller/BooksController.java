package controller;

import java.util.List;

import model.entities.Book;
import model.readers.BookReader;

public class BooksController implements EntityController<Book> {
    public final static String FILE_NAME = "Books.csv";
    private BookReader bookReader;

    public BooksController() {
        this.bookReader = new BookReader(FILE_NAME);
    }

    @Override
    public List<Book> getAllEntities() {
        bookReader.read();
        return bookReader.getBooks();
    }   
}
