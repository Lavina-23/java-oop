public class VicePresident extends Manager {
    // method overriding
    // create same method from the parent class
    void sayHello(String name) {
        System.out.println("Hai " + name + ", my name is vp " + this.name);
    }
}
