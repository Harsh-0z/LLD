package com.decorator;

public class Rajbhog implements Ingredient{
    Ingredient receivedIngredient;

    public Rajbhog(Ingredient Ing){
        this.receivedIngredient = Ing;
    }

    @Override
    public int getCost(){
        return receivedIngredient.getCost()+70;
    }

    @Override
    public void getDescription() {
       receivedIngredient.getDescription();

       System.out.print(" +   Add rajbhog icecream for user");


    }





}
