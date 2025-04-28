package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;

import model.entities.Book;

public class BookReader extends CSVReader<Book> {
    public BookReader(String FILE_NAME) {
        super(FILE_NAME);
    }

    @Override
    public void read() {
        try (BufferedReader booksReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var bookLine = booksReader.readLine();
            while ((bookLine = booksReader.readLine()) != null) {
                String[] CSVbook = bookLine.split(DELIMETER);
                if (CSVbook.length != 5) 
                    throw new Exception("The count of elements in CSV-line is not equals than 5");
                var book = new Book(
                    Integer.parseInt(CSVbook[0]),
                    CSVbook[1],
                    CSVbook[2],
                    Integer.parseInt(CSVbook[3]),
                    Integer.parseInt(CSVbook[4])
                );
                entities.add(book);
            }
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
