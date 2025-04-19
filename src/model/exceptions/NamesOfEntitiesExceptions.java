package model.exceptions;

public enum NamesOfEntitiesExceptions {
    ID_EXCEPTION("The ID can't be negative!"),
    NAME_EXCEPTION("The name can't has a digit!"),
    YEAR_EXCEPTION("The year of writing should be exist!"),
    QUANTITY_EXCEPTION("The quantity of books must be positive!"),
    DATE_EXCEPTION("The date should be exist!");

    private String name;

    private NamesOfEntitiesExceptions(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
