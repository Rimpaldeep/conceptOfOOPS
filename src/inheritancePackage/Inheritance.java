package inheritancePackage;

public class Inheritance {
    public static void main(String[] args) {
        Child child = new Child ();
        Parent parent = new Parent ();
        GrandChild grandChild = new GrandChild ();

        parent.display();
        child.display();
        grandChild.display();
        grandChild.firstName();
    }
}
