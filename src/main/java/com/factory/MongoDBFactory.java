package com.factory;


class MongoDBFactory implements DatabaseFactory {
    public Query createQuery() {
        return new MongoDBQuery();
    }
}