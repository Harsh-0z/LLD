package com.factory;

class MySQLFactory implements DatabaseFactory {
    public Query createQuery() {
        return new MySQLQuery();
    }
}