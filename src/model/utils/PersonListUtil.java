package model.utils;

import model.entities.Person;
import model.exceptions.EntityException;
import model.exceptions.NamesOfEntitiesExceptions;

public class PersonListUtil implements SingleEntityCorrectInterface<Person> {
    @Override
    public void isEntityCorrect(Person person) throws EntityException {
        if (person.getID() < 0)
            throw new EntityException(NamesOfEntitiesExceptions.ID_EXCEPTION.getName());
        
        
        for (int i = 0; i < person.getName().length(); ++i) {
            if (Character.isDigit(person.getName().charAt(i)))
                throw new EntityException(NamesOfEntitiesExceptions.NAME_EXCEPTION.getName());
        }

        for (int i = 0; i < person.getSurname().length(); ++i) {
            if (Character.isDigit(person.getSurname().charAt(i)))
                throw new EntityException(NamesOfEntitiesExceptions.NAME_EXCEPTION.getName());
        }

        for (int i = 0; i < person.getPatronymic().length(); ++i) {
            if (Character.isDigit(person.getPatronymic().charAt(i)))
                throw new EntityException(NamesOfEntitiesExceptions.NAME_EXCEPTION.getName());
        }
    }

    @Override
    public boolean updateEntity(Person person) throws EntityException {
        return true;
    }
}
