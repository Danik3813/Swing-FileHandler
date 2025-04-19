package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.entities.Entry;

public class EntryReader extends CSVReader<Entry> {
    private List<Entry> entries;

    public EntryReader(String FILE_NAME) {
        super(FILE_NAME);
        entries = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader EntriesReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var entryLine = EntriesReader.readLine();
            while((entryLine = EntriesReader.readLine()) != null) {
                String[] CSVEntry = entryLine.split(DELIMETER);
                if (CSVEntry.length != 5) 
                    throw new Exception("The count of elements in CSV-line is not equals than 5");
                var Entry = new Entry(
                    Integer.parseInt(CSVEntry[0]),
                    Integer.parseInt(CSVEntry[1]),
                    Integer.parseInt(CSVEntry[2]),
                    CSVEntry[3],
                    CSVEntry[4]
                );
                entries.add(Entry);
            }
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public List<Entry> getEntities() {
        return entries;
    }
}
