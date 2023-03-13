package inheritancePackage;

public class GrandChild extends Child{
    int d = 20;

    public void display () {
        System.out.println("Grandchild class is displaying");
    }
    public void firstName () {
        super.firstName();
        System.out.println("GrandChild - Nancy");
    }
}
