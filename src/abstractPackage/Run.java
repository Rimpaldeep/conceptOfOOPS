package abstractPackage;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        //Work work = new Work ();
        //Since Work is an abstract class so it will not allow us to create an object


        Work work;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equalsIgnoreCase("Employee")) {
            work = new Employee();
        }
        else {
            work = new Employer();
        }
        work.play();

    }
}
