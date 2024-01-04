public class ManagerApp {
    public static void main(String[] args) {
        Manager manager = new Manager("Kayla");
        // manager.name = "Mayla";
        manager.sayHello("Kayla");

        // inheritance
        VicePresident vp = new VicePresident("Lavina");
        // vp.name = "Lavina"; // it inherits properties from class manager
        vp.sayHello("Iwed");
    }
}
