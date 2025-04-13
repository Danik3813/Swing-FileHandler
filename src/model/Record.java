package model;

public class Record {
    private int ID;
    private int bookID;
    private int personID;
    private String issueDate;
    private String givenDate;

    public Record(int ID, int bookID, int personID, String issueDate, String givenDate) {
        this.ID = ID;
        this.bookID = bookID;
        this.personID = personID;
        this.issueDate = issueDate;
        this.givenDate = givenDate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonD(int personID) {
        this.personID = personID;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getGivenDate() {
        return issueDate;
    }

    public void setGivenDate(String givenDate) {
        this.givenDate = givenDate;
    }
}
