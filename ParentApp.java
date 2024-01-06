public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "Lavina";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt(); // use method from child
        System.out.println(parent.name); // use field from parent, return null because of variable hiding
    }
}
