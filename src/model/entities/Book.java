package model.entities;

public class Book extends Entity {
    private String author;
    private String name;
    // TODO: заменить год написания на Java Calendar
    private int writingYear;
    private int quanitity;

    public Book(int ID, String author, String name, int writingYear, int quanitity) {
        super(ID);
        this.author = author;
        this.name = name;
        this.writingYear = writingYear;
        this.quanitity = quanitity;
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

    public int getWritingYear() {
        return writingYear;
    }

    public void setWritingYear(int writingYear) {
        this.writingYear = writingYear;
    }

    public int getQuanitity() {
        return quanitity;
    }

    public void setQuanitity(int quanitity) {
        this.quanitity = quanitity;
    }
}
