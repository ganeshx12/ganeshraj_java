
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        int id = sc.nextInt();

        System.out.println("Enter Employee Name:");
        String name = sc.next();

        System.out.println("Enter Employee Salary:");
        double salary = sc.nextDouble();

        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);

        sc.close();
    }
}
