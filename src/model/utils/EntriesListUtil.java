package model.utils;

import java.util.List;

import model.entities.*;
import model.exceptions.EntityException;
import model.exceptions.NamesOfEntitiesExceptions;

public class EntriesListUtil implements MultiEntityCorrectInterface<Entry, Book, Person> {
    @Override
    public void isEntityCorrect(Entry entry, List<Book> books, List<Person> persons) throws EntityException {
        if (entry.getID() < 0 || entry.getBookID() < 0 || entry.getPersonID() < 0)
            throw new EntityException(NamesOfEntitiesExceptions.ID_EXCEPTION.getName());
        
        boolean bookIDExist = false;
        for (Book book : books) {
            if (entry.getBookID() == book.getID())
                bookIDExist = true;
        }

        boolean personIDExist = false;
        for (Person person : persons) {
            if (entry.getPersonID() == person.getID())
                personIDExist = true;
        }

        if (bookIDExist || personIDExist) 
            throw new EntityException(NamesOfEntitiesExceptions.FOREIGN_ID_EXCEPTION.getName());

        // TODO: добавить валидность дат issueDate, givenDate
        
        // TODO: добавить проверку на возможность уменьшить число книг в каталоге при взятии книги
    }

    @Override
    public boolean updateEntity(Entry entry, List<Book> books, List<Person> persons) throws EntityException {
        return true;
    }
}
