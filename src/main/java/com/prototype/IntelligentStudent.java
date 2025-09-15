package com.prototype;


class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }

    // Copy constructor
    public IntelligentStudent(IntelligentStudent original) {
        super(original);//goes to the parent and set the 2 properties and flow comes back 
        this.iq = original.iq;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    @Override
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", IQ: " + iq);
    }
}
