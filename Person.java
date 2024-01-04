class Person {
    String name;
    String address;
    final String country = "Indonesia";

    // constructor
    // similar to a basic method, but when it's called, the params must be filled
    Person(String name, String paramAddress) {
        this.name = name; // the 'this' keyword is used to access the object's variabels
        // 'this.name' is from object, 'name' is from param
        address = paramAddress;
    }

    // constructor overloading
    // constructor can be created more than one

    // Person(String name, String paramAddress) {
    // this.name = name;
    // address = paramAddress;
    // } -> error, because the params can't be similar to each other

    Person(String name) {
        // name = paramName;
        this(name, null); // call params from the first constructor
    }

    Person() {
        this(null);
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + ", my name is " + this.name);
    }
}