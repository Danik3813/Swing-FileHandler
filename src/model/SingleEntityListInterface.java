package model;

import model.entities.Entity;

public interface SingleEntityListInterface<T extends Entity> {
    void push(T entity);

    void update(T entity);
}
