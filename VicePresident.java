public class VicePresident extends Manager {
    public static void main(String[] args) {
        VicePresident vp = new VicePresident();
        vp.name = "Lavina"; // it inherits properties from class manager
        vp.sayHello("Iwed");
    }
}
