package com.prototype;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20);
        Student s2 = s1.copy();   // clone Student

        IntelligentStudent is1 = new IntelligentStudent("Bob", 22, 140);
        IntelligentStudent is2 = is1.copy(); // clone IntelligentStudent

        // Modify clone to show independence
        is2.name = "Charlie";
        is2.iq = 150;

        s1.display();   // Name: Alice, Age: 20
        s2.display();   // Name: Alice, Age: 20

        is1.display();  // Name: Bob, Age: 22, IQ: 140
        is2.display();  // Name: Charlie, Age: 22, IQ: 150
    }
}
