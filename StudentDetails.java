import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);

        sc.close();
    }
}
