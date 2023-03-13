package inheritancePackage;

public class Child extends Parent {
    int c = 15;

    public void display() {
        System.out.println("Child class is displaying");

        }
        public void firstName () {
        super.firstName();
            System.out.println("Child - John");
        }

    }
