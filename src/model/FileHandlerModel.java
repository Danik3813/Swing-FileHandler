package model;

import model.entities.*;

public class FileHandlerModel {
    BookList bookList;
    PersonList personList;
    EntriesList entriesList;

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

    public BookList getBookList()  {
        return bookList;
    }

    public PersonList getPersonList()  {
        return personList;
    }

    public EntriesList getEntriesList()  {
        return entriesList;
    }

    public void saveModel() {
        bookList.saveEntityList();
        personList.saveEntityList();
        entriesList.saveEntityList();
    }
}
