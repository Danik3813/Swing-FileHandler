package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.entities.Person;

public class PersonReader extends CSVReader {
    private List<Person> persons;

    public PersonReader(String FILE_NAME) {
        super(FILE_NAME);
        persons = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader personReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var personLine = personReader.readLine();
            while ((personLine = personReader.readLine()) != null) {
                String[] CSVperson = personLine.split(DELIMETER);
                // Добавить проверку на число элементов строки
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

    public List<Person> getPersons() {
        return persons;
    }
}
