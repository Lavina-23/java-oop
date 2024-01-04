public class PersonApp {
    public static void main(String[] args) {
        Person person1 = new Person("Lavina", "Losawi");
        // if used constructor, initialize the property is unnecessary
        // person1.name = "Lavina";
        // person1.address = "Losawi";
        // person1.country = "America"; -> error, because it's variable is final

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        System.out.println();
        person1.sayHello("Anais");

        Person person2 = new Person("Iwed");
        person2.sayHello("Putri");

        Person person3 = new Person();
        person3.name = "Kayla";
        person3.sayHello("Mayla"); // -> my name is null, because it hasn't been set yet
        System.out.println();

        Manager manager = new Manager();
        manager.name = "Mayla";
        manager.sayHello("Kayla");

        // inheritance
        VicePresident vp = new VicePresident();
        vp.name = "Lavina"; // it inherits properties from class manager
        vp.sayHello("Iwed");
    }
}
