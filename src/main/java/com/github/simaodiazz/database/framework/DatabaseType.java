package com.github.simaodiazz.database.framework;

public interface DatabaseType {

    enum Relational implements DatabaseType {
        MYSQL,
        SQLITE
    }

    enum Memory implements DatabaseType {
        REDIS,
        NATIVE
    }
}