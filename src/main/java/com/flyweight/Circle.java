package com.flyweight;

public class Circle implements Shape{

    private final String color;    // constant state or property of a class


    public Circle(String color) {
        this.color = color;
        System.out.println("--- CREATING a new circle of color: " + color + " ---");

    }

    // this is the property which will change
    @Override
    public void draw(int x, int y, int radius) {
        System.out.println("Drawing a " + color + " circle at (" + x + ", " + y + ") with radius " + radius);
    }


}
