package model;

import model.entities.Person;
import model.exceptions.EntityException;
import model.readers.CSVReader;
import model.readers.PersonReader;
import model.savers.CSVSaver;
import model.savers.PersonSaver;
import model.utils.PersonListUtil;

public class PersonList extends EntityList<Person> implements EntityListInterface<Person> {
    @Override
    public void initializeEntityList() {
        CSVReader<Person> personReader = new PersonReader(FilesName.PERSONS.getFileName());
        personReader.read();
        entities = personReader.getEntities();
    }

    @Override
    public void saveEntityList() {
        CSVSaver<Person> personSaver = new PersonSaver(FilesName.PERSONS.getFileName(), entities);
        personSaver.save();
    }

    @Override
    public void push(Person person) {
        PersonListUtil personListUtil = new PersonListUtil();
        try {
            personListUtil.isEntityCorrect(person);
            entities.add(person);
        } catch (EntityException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Person person) {

    }
}
