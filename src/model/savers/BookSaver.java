package model.savers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import model.entities.Book;

public class BookSaver extends CSVSaver<Book> {
    private static final String FILE_HEADER = "id,author,name,year,count";

    public BookSaver(String FILE_NAME, List<Book> books) {
        super(FILE_NAME, books);
    }

    @Override
    public void save() {
        try (BufferedWriter booksWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            booksWriter.write(FILE_HEADER);
            for (Book book : entities) {
                booksWriter.newLine();
                // TODO: использовать StringBuilder

                var bookID = Integer.toString(book.getID()) + DELIMETER;
                var bookAuthor = book.getAuthor() + DELIMETER;
                var bookName = book.getName() + DELIMETER;
                var bookWritingYear = Integer.toString(book.getWritingYear()) + DELIMETER;
                var bookQuantity = Integer.toString(book.getQuanitity());

                var booksLine = bookID + bookAuthor + bookName + bookWritingYear + bookQuantity;

                booksWriter.write(booksLine);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
