package com.decorator;

public class Main {
    public static void main(String[] args) {

        Ingredient ic = new Rajbhog(new ChocolateCone());

        ic.getCost();
        ic.getDescription();


    }
}
