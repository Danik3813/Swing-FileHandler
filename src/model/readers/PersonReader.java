package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.entities.Person;

public class PersonReader extends CSVReader<Person> {
    private List<Person> persons;

    public PersonReader(String FILE_NAME) {
        super(FILE_NAME);
        persons = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader personsReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var personLine = personsReader.readLine();
            while ((personLine = personsReader.readLine()) != null) {
                String[] CSVperson = personLine.split(DELIMETER);
                if (CSVperson.length != 4) 
                    throw new Exception("The count of elements in CSV-line is not equals than 4");
                var person = new Person(
                    Integer.parseInt(CSVperson[0]),
                    CSVperson[1],
                    CSVperson[2],
                    CSVperson[3]
                );
                persons.add(person);
            }
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Person> getEntities() {
        return persons;
    }
}
