public class VicePresident extends Manager {
    VicePresident(String name) {
        // if parent class has a const, the child class should call the parent's const
        super(name);
    }

    // method overriding
    // create same method from the parent class
    void sayHello(String name) {
        System.out.println("Hai " + name + ", my name is vp " + this.name);
    }
}
