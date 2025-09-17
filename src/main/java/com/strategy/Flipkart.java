package com.strategy;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart{
    private Courier courier ;

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public Flipkart() {
        System.out.println("0 param constructor");
    }

    public String shopping(String items[],double prices[]){
        double billamout  = 0.0;

        for(double p:prices){
            billamout += p;
        }

        int id = new Random().nextInt(1000000);


        String msg = courier.deliver(id);

        return Arrays.toString(items)+" are purchased having bill amount "+billamout +msg;


    }


}
