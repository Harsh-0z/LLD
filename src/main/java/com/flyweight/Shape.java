package com.flyweight;

public interface Shape {
    // The extrinsic state (x, y, radius) is passed to the method.
    void draw(int x, int y, int radius);
}
