package com.strategy;

public final class BlueDart implements Courier {
    @Override
    public String deliver(int oid) {
        return oid+" order id is set to deliver using bluedart service";
    }
}
