package model;

import java.util.ArrayList;
import java.util.List;

import model.entities.*;
import model.readers.*;

public class FileHandlerModel {
    List<Book> books;
    List<Person> persons;
    List<Entry> entries;

    public FileHandlerModel() {
        books = new ArrayList<>();
        persons = new ArrayList<>();
        entries = new ArrayList<>();
    }

    public void initializeModel() {
        CSVReader<Book> bookReader = new BookReader(FilesName.BOOKS.getFileName());
        bookReader.read();
        books = bookReader.getEntities();

        CSVReader<Person> personReader = new PersonReader(FilesName.PERSONS.getFileName());
        personReader.read();
        persons = personReader.getEntities();

        CSVReader<Entry> entriesReader = new EntryReader(FilesName.ENTRIES.getFileName());
        entriesReader.read();
        entries = entriesReader.getEntities();
    }

    
}
