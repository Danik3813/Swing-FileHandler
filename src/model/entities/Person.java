package model.entities;

public class Person extends Entity {
    private String name;
    private String surname;
    private String patronymic;

    public Person(int ID, String name, String surname, String patronymic) {
        super(ID);
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
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
