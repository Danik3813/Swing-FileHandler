package model.savers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import model.entities.Person;

public class PersonSaver extends CSVSaver<Person> {
    private static final String FILE_HEADER = "id,name,surname,patronymic";

    public PersonSaver(String FILE_NAME, List<Person> persons) {
        super(FILE_NAME, persons);
    }

    @Override
    public void save() {
        try (BufferedWriter personsWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            personsWriter.write(FILE_HEADER);
            for (Person person : entities) {
                // TODO: использовать StringBuilder

                personsWriter.newLine();
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
