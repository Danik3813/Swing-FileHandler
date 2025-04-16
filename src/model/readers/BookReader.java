package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.entities.Book;

public class BookReader extends CSVReader {
    private List<Book> books;

    public BookReader(String FILE_NAME) {
        super(FILE_NAME);
        books = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader booksReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var bookLine = booksReader.readLine();
            while ((bookLine = booksReader.readLine()) != null) {
                String[] CSVbook = bookLine.split(DELIMETER);
                // Добавить проверку на число элементов строки
                var book = new Book(
                    Integer.parseInt(CSVbook[0]),
                    CSVbook[1],
                    CSVbook[2],
                    CSVbook[3],
                    Integer.parseInt(CSVbook[4])
                );
                books.add(book);
            }
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
