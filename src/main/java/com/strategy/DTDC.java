package com.strategy;

public final class DTDC implements Courier {
    @Override
    public String deliver(int oid) {
        return oid+" order id is set for delivery using DTDC";
    }

    public DTDC(){
        System.out.println("0 param constructor");
    }
}
