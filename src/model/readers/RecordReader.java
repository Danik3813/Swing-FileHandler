package model.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import model.Record;

public class RecordReader extends CSVReader {
    private List<Record> records;

    public RecordReader(String FILE_NAME) {
        super(FILE_NAME);
        records = new ArrayList<>();
    }

    @Override
    public void read() {
        try (BufferedReader recordsReader = new BufferedReader(new FileReader(FILE_NAME))) {
            var recordLine = recordsReader.readLine();
            while((recordLine = recordsReader.readLine()) != null) {
                String[] CSVrecord = recordLine.split(DELIMETER);
                // Добавить проверку на число элементов строки
                var record = new Record(
                    Integer.parseInt(CSVrecord[0]),
                    Integer.parseInt(CSVrecord[1]),
                    Integer.parseInt(CSVrecord[2]),
                    CSVrecord[3],
                    CSVrecord[4]
                );
                records.add(record);
            }
        } catch(NumberFormatException e) {
            System.err.println(e.getMessage());
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Record> getRecords() {
        return records;
    }
}
