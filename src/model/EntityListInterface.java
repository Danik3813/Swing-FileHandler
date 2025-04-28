package model;

import model.entities.Entity;

public interface EntityListInterface<T extends Entity> {
    void push(T entity);

    void update(T entity);
}
