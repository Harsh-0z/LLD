package com.factory;

public class AbstractFactoryDatabaseDemo {
    public static void main(String[] args) {
        // choose database type dynamically
        DatabaseFactory factory;

        String dbType = "MYSQL"; // could come from config/env

        if (dbType.equalsIgnoreCase("MYSQL")) {
            factory = new MySQLFactory();
        } else {
            factory = new MongoDBFactory();
        }

        // use factory
        Query query = factory.createQuery();
        query.execute();
    }
}