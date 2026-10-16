
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principal Amount:");
        double p = sc.nextDouble();

        System.out.println("Enter Rate of Interest:");
        double r = sc.nextDouble();

        System.out.println("Enter Time in Years:");
        double t = sc.nextDouble();

        double si = (p * r * t) / 100;

        System.out.println("Simple Interest = " + si);

        sc.close();
    }
}
