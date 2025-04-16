package controller;

import java.util.List;

public interface EntityController<T> {
    List<T> getAllEntities();

    T inputEntity(List<String> entities);
}