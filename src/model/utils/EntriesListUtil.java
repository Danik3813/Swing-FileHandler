package model.utils;

import model.entities.*;
import model.exceptions.EntityException;
import model.exceptions.NamesOfEntitiesExceptions;

public class EntriesListUtil implements EntityCorrectInterface<Entry> {
    @Override
    public void isEntityCorrect(Entry entry) throws EntityException {
        if (entry.getID() < 0 || entry.getBookID() < 0 || entry.getPersonID() < 0)
            throw new EntityException(NamesOfEntitiesExceptions.ID_EXCEPTION.getName());

        // TODO: добавить валидность дат issueDate, givenDate
        
        // TODO: добавить проверку на возможность уменьшить число книг в каталоге при взятии книги
    }

    @Override
    public boolean updateEntity(Entry entry) throws EntityException {
        return true;
    }
}
