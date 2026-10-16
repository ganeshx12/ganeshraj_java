
import java.util.Scanner;

class MyClass {
    int X;
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyClass myObj = new MyClass();

        System.out.print("Enter a value for X: ");
        myObj.X = sc.nextInt();

        System.out.println("Value of X = " + myObj.X);

        sc.close();
    }
}
