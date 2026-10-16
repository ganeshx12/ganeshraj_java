
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        double square = num * num;

        System.out.printf("Square = %.2f%n", square);

        sc.close();
    }
}
