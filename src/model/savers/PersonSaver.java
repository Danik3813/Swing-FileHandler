package model.savers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import model.entities.Person;

public class PersonSaver extends CSVSaver {
    private List<Person> persons;
    private static final String FILE_HEADER = "id,name,surname,patronymic";

    public PersonSaver(String FILE_NAME, List<Person> persons) {
        super(FILE_NAME);
        this.persons = persons;
    }

    @Override
    public void save() {
        try (BufferedWriter personsWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            personsWriter.write(FILE_HEADER);
            for (Person person : persons) {
                // TODO: использовать StringBuilder

                var personID = Integer.toString(person.getID()) + ",";
                var personName = person.getName() + ",";
                var personSurname = person.getSurname() + ",";
                var personPatronymic = person.getPatronymic();

                var personLine = personID + personName + personSurname + personPatronymic;
                
                personsWriter.write(personLine);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
