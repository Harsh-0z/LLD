package com.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<String,Shape> circleCache = new HashMap<>();

    public static Shape getCircle(String color){
        Shape circle = circleCache.get(color);

        if (circle == null) {
            // If it doesn't exist, create a new one and add it to the cache.
            circle = new Circle(color);
            circleCache.put(color, circle);
        }
        // Return the existing or newly created instance.
        return circle;





    }

}


