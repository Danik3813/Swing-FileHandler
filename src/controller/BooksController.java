package controller;

import java.util.List;

import model.readers.BookReader;
import model.Book;

public class BooksController {
    public final static String FILE_NAME = "Books.csv";
    private BookReader bookReader;

    public BooksController() {
        this.bookReader = new BookReader(FILE_NAME);
    }

    public List<Book> getAllBooks() {
        bookReader.read();
        return bookReader.getBooks();
    }   
}
