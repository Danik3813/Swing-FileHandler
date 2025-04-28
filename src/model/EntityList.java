package model;
import model.entities.Entity;

import java.util.ArrayList;
import java.util.List;

abstract public class EntityList<T extends Entity> {
    protected List<T> entities;

    public EntityList() {
        entities = new ArrayList<>();
    }

    public List<T> getEntities() {
        return entities;
    }

    public void setEntities(List<T> entities) {
        this.entities = entities;
    }

    public int getNewID() {
        return entities.get(entities.size() - 1).getID() + 1;
    }

    abstract public void initializeEntityList();

    abstract public void saveEntityList();
}
