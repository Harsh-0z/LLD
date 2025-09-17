package com.flyweight;

public class FlyweightDemo {
    private static final String[] colors = {"Red", "Green", "Blue", "Black", "Yellow"};

    public static void main(String[] args) {
        System.out.println("Drawing 20 circles using the Flyweight pattern:");

        for (int i = 0; i < 20; ++i) {
            // 1. Get a random color.
            String randomColor = colors[(int) (Math.random() * colors.length)];

            // 2. Get the shared circle object from the factory.
            Shape circle = ShapeFactory.getCircle(randomColor);//red

            // 3. Generate unique extrinsic state (coordinates and radius).
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            int radius = (int) (Math.random() * 50);

            // 4. Call the draw method, passing the unique state.
            circle.draw(x, y, radius);
        }
    }
}