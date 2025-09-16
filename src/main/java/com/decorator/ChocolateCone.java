package com.decorator;

public class ChocolateCone implements Ingredient {

    // This is a base component, so it has no other ingredient to wrap.
    public ChocolateCone() {

    }

    @Override
    public int getCost() {
        // It returns its own base cost.
        return 30;
    }

    @Override
    public void getDescription() {
        // It provides its own base description.
        System.out.print("Base: Chocolate Cone");
    }
}