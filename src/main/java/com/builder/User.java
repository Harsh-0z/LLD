package com.builder;


import java.util.logging.Logger;

public class User {
    private final String name;
    private final int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder() { /*just a default constructor for the creating object in User class call  */ }

        public Builder age(int x) {
            if (x < 0) {
                throw new IllegalArgumentException("age can't be negative");
            }
            this.age = x;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }

    public static void main(String[] args) {
        User u = new User.Builder()
                .age(10)
                .name("harsh")
                .build();

        Logger logger = Logger.getLogger(User.class.getName());
        logger.info("User name is :"+u.getName());
        logger.info("User age is :"+u.getAge());

    }
}
