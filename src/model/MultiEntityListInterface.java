package model;

import java.util.List;

import model.entities.Entity;

public interface MultiEntityListInterface<T1 extends Entity, T2 extends Entity, T3 extends Entity> {
    void push(T1 entity1, List<T2> entities2, List<T3> entity3);

    void update(T1 entity1, List<T2> entities2, List<T3> entity3);
}
