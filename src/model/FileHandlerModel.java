package model;

import model.entities.*;

public class FileHandlerModel {
    EntityList<Book> bookList;
    EntityList<Person> personList;
    EntityList<Entry> entriesList;

    public FileHandlerModel() {
        bookList = new BookList();
        personList = new PersonList();
        entriesList = new EntriesList();
    }

    public void initializeModel() {
        bookList.initializeEntityList();
        personList.initializeEntityList();
        entriesList.initializeEntityList();
    }

    public EntityList<Book> getBookList()  {
        return bookList;
    }

    public EntityList<Person> getPersonList()  {
        return personList;
    }

    public EntityList<Entry> getEntriesList()  {
        return entriesList;
    }
}
