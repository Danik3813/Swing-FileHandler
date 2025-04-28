package model;

import model.entities.Book;
import model.exceptions.EntityException;
import model.readers.BookReader;
import model.readers.CSVReader;
import model.savers.BookSaver;
import model.savers.CSVSaver;
import model.utils.BookListUtil;

public class BookList extends EntityList<Book> implements EntityListInterface<Book> {
    @Override
    public void initializeEntityList() {
        CSVReader<Book> bookReader = new BookReader(FilesName.BOOKS.getFileName());
        bookReader.read();
        entities = bookReader.getEntities();
    }

    @Override
    public void saveEntityList() {
        CSVSaver<Book> bookSaver = new BookSaver(FilesName.BOOKS.getFileName(), entities);
        bookSaver.save();
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
