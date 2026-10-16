
import java.util.Scanner;

class MyClass {
    int X;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        System.out.print("Enter value for object 1: ");
        obj1.X = sc.nextInt();

        System.out.print("Enter value for object 2: ");
        obj2.X = sc.nextInt();

        System.out.println("Value of object 1 = " + obj1.X);
        System.out.println("Value of object 2 = " + obj2.X);

        sc.close();
    }
}
