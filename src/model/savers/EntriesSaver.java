package model.savers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import model.entities.Entry;

public class EntriesSaver extends CSVSaver<Entry> {
    private final static String FILE_HEADER = "id,book_id,person_id,issue_date,given_date";

    public EntriesSaver(String FILE_NAME, List<Entry> entries) {
        super(FILE_NAME, entries);
    }

    @Override
    public void save() {
        try (BufferedWriter entriesWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            entriesWriter.write(FILE_HEADER);
            for (Entry entry : entities) {
                // TODO: использовать StringBuilder

                entriesWriter.newLine();
                var entryID = Integer.toString(entry.getID()) + ",";
                var bookID = Integer.toString(entry.getBookID()) + ",";
                var personID = Integer.toString(entry.getPersonID()) + ",";
                var entryIssueDate = entry.getIssueDate() + ",";
                var entryGivenDate = entry.getGivenDate();

                var entryLine = entryID + bookID + personID + entryIssueDate + entryGivenDate;

                entriesWriter.write(entryLine);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
