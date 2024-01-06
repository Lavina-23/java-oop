public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Lavina");
        employee.sayHello("Iwed");

        employee = new Manager("Lavina"); // employee can change into the manager type
        employee.sayHello("Putri");
        // employee.company = "BRI"; -> error because even tho the type has been changed
        // to manager, the company field in the class manager can't be used

        employee = new VicePresident("Lavina"); // employee can change into vicepresident types
        employee.sayHello("Anais");

        sayHello(new Employee("Lavina"));
        sayHello(new Manager("Lavina"));
        sayHello(new VicePresident("Lavina"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) { // to check if employee is an object of type vicepresident
            VicePresident vicePresident = (VicePresident) employee; // cast from an employee to a vicepresident type
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
