package model;

public class Person {
    private int ID;
    private String name;
    private String surname;
    private String patronymic;

    public Person(int ID, String name, String surname, String patronymic) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String Patronymic) {
        this.patronymic = Patronymic;
    }
}
