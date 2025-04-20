package model.savers;

/**
 * Абстрактный класс для сохранения данных в CSV-файлов из сущностей приложения
 * @author Купцов Д.
 * @version 1.0-alpha
 */

public abstract class CSVSaver {
    private static final String RESOURCES_PATH = "resources/";
    protected String FILE_NAME;
    protected static final String DELIMETER = ",";

    public CSVSaver(String FILE_NAME) {
        this.FILE_NAME = RESOURCES_PATH + FILE_NAME;
    }

    abstract void save();
}
