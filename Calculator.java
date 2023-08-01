import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcf = euclideanAlgorithm(num1, num2);
        System.out.println("Greatest Common Factor (GCF): " + gcf);
        
        if (gcf == 1) {
            System.out.println("The numbers are coprime.");
        } else {
            System.out.println("The numbers are not coprime.");
        }
    }

    public static int euclideanAlgorithm(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return euclideanAlgorithm(b, a % b);
        }
    }
}
