package com.decorator;


public class OrangeCone implements Ingredient {

    // This is a base component, so it has no other ingredient to wrap.
    public OrangeCone() {

    }

    @Override
    public int getCost() {
        return 20; // Base cost of the cone
    }

    @Override
    public void getDescription() {
        System.out.print("Base: Orange Cone");
    }
}
