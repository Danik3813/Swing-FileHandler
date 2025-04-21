package model;

import model.entities.Book;
import model.exceptions.EntityException;
import model.readers.BookReader;
import model.readers.CSVReader;
import model.utils.BookListUtil;

public class BookList extends EntityList<Book> implements SingleEntityListInterface<Book> {
    @Override
    public void initializeEntityList() {
        CSVReader<Book> bookReader = new BookReader(FilesName.BOOKS.getFileName());
        bookReader.read();
        entities = bookReader.getEntities();
    }

    @Override
    public void push(Book book) {
        BookListUtil bookListUtil = new BookListUtil();
        try {
            bookListUtil.isEntityCorrect(book);
            entities.add(book);
        } catch (EntityException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Book book) {

    }
}
