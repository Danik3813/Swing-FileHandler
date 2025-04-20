package model.savers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import model.entities.Book;

public class BookSaver extends CSVSaver {
    private List<Book> books;
    private static final String FILE_HEADER = "id,author,name,year,count";

    public BookSaver(String FILE_NAME, List<Book> books) {
        super(FILE_NAME);
        this.books = books;
    }

    @Override
    public void save() {
        try (BufferedWriter booksWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            booksWriter.write(FILE_HEADER);
            for (Book book : books) {
                // TODO: использовать StringBuilder

                var bookID = Integer.toString(book.getID()) + ",";
                var bookAuthor = book.getAuthor() + ",";
                var bookName = book.getName() + ",";
                var bookWritingYear = Integer.toString(book.getWritingYear()) + ",";
                var bookQuantity = Integer.toString(book.getQuanitity());

                var booksLine = bookID + bookAuthor + bookName + bookWritingYear + bookQuantity;

                booksWriter.write(booksLine);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
