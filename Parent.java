class Parent {
    String name;

    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name; // if the parent class already has this field, don't create the same field
                 // again, it will cause variable hiding

    void doIt() {
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name); // to access name from parent class
    }
}