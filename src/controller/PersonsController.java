package controller;

import java.util.List;

import model.entities.Person;
import model.readers.PersonReader;

public class PersonsController implements EntityController<Person> {
    public static final String FILE_NAME = "Persons.csv";
    private PersonReader personReader;

    public PersonsController() {
        this.personReader = new PersonReader(FILE_NAME);
    }

    @Override
    public List<Person> getAllEntities() {
        personReader.read();
        return personReader.getPersons();
    }
}
