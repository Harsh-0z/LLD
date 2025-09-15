package com.prototype;

class Student implements Prototype<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor

    //---->   In Java, a copy constructor is just a constructor
    // that takes another object of the same class as a parameter and copies its fields.
    public Student(Student original) {
        this.name = original.name;
        this.age = original.age;
    }

    @Override
    public Student copy() {
        return new Student(this); // delegate to copy constructor
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
