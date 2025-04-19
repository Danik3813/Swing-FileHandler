package model;

public enum FilesName {
    BOOKS("Books.csv"), 
    PERSONS("Persons.csv"), 
    ENTRIES("Entries.csv");
    
    private String fileName;

    private FilesName(String fileName) {
        this.fileName = fileName;
    }

    String getFileName() {
        return fileName;
    }
}
