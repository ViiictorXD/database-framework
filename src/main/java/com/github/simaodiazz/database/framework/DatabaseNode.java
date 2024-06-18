package com.github.simaodiazz.database.framework;

public interface DatabaseNode<T extends Database> {

    String getId();

    T getDatabase();

}