package com.decorator;

public class BlackCurrent implements Ingredient{
    Ingredient receivedIngredient;

    public BlackCurrent(Ingredient Ing) {
        this.receivedIngredient = Ing;
    }

    @Override
    public void getDescription() {
        receivedIngredient.getDescription();
        System.out.print("           Add black current icecream for user ");
    }

    @Override
    public int getCost(){
        return receivedIngredient.getCost()+50;
    }



}
