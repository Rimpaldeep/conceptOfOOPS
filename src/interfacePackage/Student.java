package interfacePackage;

public interface Student {
    int a = 10; //this will be constant throughout the application

    void reading(); // no need to use abstract keyword here

    static void display() {
        System.out.println("Student is displaying");
    }
}
