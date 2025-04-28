package model;

import model.entities.Entry;
import model.exceptions.EntityException;
import model.readers.CSVReader;
import model.readers.EntryReader;
import model.savers.CSVSaver;
import model.savers.EntriesSaver;
import model.utils.EntriesListUtil;

public class EntriesList extends EntityList<Entry> implements EntityListInterface<Entry> {
    @Override
    public void initializeEntityList() {
        CSVReader<Entry> entriesReader = new EntryReader(FilesName.ENTRIES.getFileName());
        entriesReader.read();
        entities = entriesReader.getEntities();
    }

    @Override
    public void saveEntityList() {
        CSVSaver<Entry> entriesSaver = new EntriesSaver(FilesName.ENTRIES.getFileName(), entities);
        entriesSaver.save();
    }

    @Override
    public void push(Entry entry) {
        EntriesListUtil entriesListUtil = new EntriesListUtil();
        try {
            entriesListUtil.isEntityCorrect(entry);
            entities.add(entry);
        } catch (EntityException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void update(Entry entry) {

    }

}
