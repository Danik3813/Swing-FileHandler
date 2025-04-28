package model.readers;

import java.util.ArrayList;
import java.util.List;

import model.entities.Entity;

/**
 * Абстрактный класс для считывателей данных из CSV-файлов
 * @author Купцов Д.
 * @version 1.0-alpha
 */

public abstract class CSVReader<T extends Entity> {
    private static final String RESOURCES_PATH = "resources/";
    protected String FILE_NAME;
    protected static final String DELIMETER = ",";
    protected List<T> entities;

    public CSVReader(String FILE_NAME) {
        this.FILE_NAME = RESOURCES_PATH + FILE_NAME;
        entities = new ArrayList<>();
    }

    abstract public void read();

    public List<T> getEntities() {
        return entities;
    }
}
