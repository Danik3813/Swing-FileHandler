package model.readers;

public abstract class CSVReader {
    private static final String RESOURCES_PATH = "resources/";
    protected String FILE_NAME;
    protected static final String DELIMETER = ",";

    public CSVReader(String FILE_NAME) {
        this.FILE_NAME = RESOURCES_PATH + FILE_NAME;
    }

    abstract public void read();
}
