package com.strategy;

public class FlipkartFactory {

    public static Flipkart getFlipkart(String courierType){

        //create dependent class object .
        Courier courier = null;

        if(courierType.equalsIgnoreCase("dtdc")){
            courier = new DTDC();
        }else if(courierType.equalsIgnoreCase("bluecart")){
            courier = new BlueDart();
        }else{
            throw new IllegalArgumentException("Invalid courierType");
        }

        Flipkart flipkart = new Flipkart();
        //assign dependent class object to target class object .
        flipkart.setCourier(courier);
        return flipkart;



    }


}