package model.utils;

import java.util.List;

import model.entities.Entity;
import model.exceptions.EntityException;

public interface MultiEntityCorrectInterface<T1 extends Entity, T2 extends Entity, T3 extends Entity> {
    void isEntityCorrect(T1 entity1, List<T2> entities2, List<T3> entity3) throws EntityException;

    boolean updateEntity(T1 entity1, List<T2> entities2, List<T3> entity3) throws EntityException;
}
