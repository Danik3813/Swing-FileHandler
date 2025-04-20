package model.utils;

import model.entities.Entity;
import model.exceptions.EntityException;

public interface SingleEntityCorrectInterface<T extends Entity> {
    void isEntityCorrect(T entity) throws EntityException;

    boolean updateEntity(T entity) throws EntityException;
}
