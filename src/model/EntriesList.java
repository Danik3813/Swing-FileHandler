package model;

import java.util.List;

import model.entities.Book;
import model.entities.Entry;
import model.entities.Person;
import model.exceptions.EntityException;
import model.readers.CSVReader;
import model.readers.EntryReader;
import model.utils.EntriesListUtil;

public class EntriesList extends EntityList<Entry> implements MultiEntityListInterface<Entry, Book, Person> {
    @Override
    public void initializeEntityList() {
        CSVReader<Entry> entriesReader = new EntryReader(FilesName.ENTRIES.getFileName());
        entriesReader.read();
        entities = entriesReader.getEntities();
    }

    @Override
    public void push(Entry entry, List<Book> books, List<Person> persons) {
        EntriesListUtil entriesListUtil = new EntriesListUtil();
        try {
            entriesListUtil.isEntityCorrect(entry, books, persons);
            entities.add(entry);
        } catch (EntityException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Entry entry, List<Book> books, List<Person> persons) {

    }
}
