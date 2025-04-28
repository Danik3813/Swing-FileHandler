package model.savers;

import java.util.List;

import model.entities.Entity;

/**
 * Абстрактный класс для сохранения данных в CSV-файлов из сущностей приложения
 * @author Купцов Д.
 * @version 1.0-alpha
 */

public abstract class CSVSaver<T extends Entity> {
    private static final String RESOURCES_PATH = "resources/";
    protected String FILE_NAME;
    protected static final String DELIMETER = ",";
    protected List<T> entities;

    public CSVSaver(String FILE_NAME, List<T> entities) {
        this.FILE_NAME = RESOURCES_PATH + FILE_NAME;
        this.entities = entities;
    }

    public abstract void save();
}
