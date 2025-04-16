package model.entities;

public class Book {
    private int ID;
    private String author;
    private String name;
    private String writingYear;
    private int quanitity;

    public Book(int ID, String author, String name, String writingYear, int quanitity) {
        this.ID = ID;
        this.author = author;
        this.name = name;
        this.writingYear = writingYear;
        this.quanitity = quanitity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWritingYear() {
        return writingYear;
    }

    public void setWritingYear(String writingYear) {
        this.writingYear = writingYear;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }
}
