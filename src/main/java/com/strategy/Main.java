package com.strategy;

public class Main {
    public static void main(String[] args) {


        Flipkart flipkart = FlipkartFactory.getFlipkart("dtdc");

        String shopping = flipkart.shopping(new String[]{"shirt","pant","suit"},new double[]{2000,3000,5000});


        System.out.println(shopping);





    }

}
