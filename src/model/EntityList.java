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

    abstract public void initializeEntityList();

    
}
