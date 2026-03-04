import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.print("Enter a, b, c, d: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        System.out.print("Enter u and v: ");
        double u = sc.nextDouble();
        double v = sc.nextDouble();

        // Expressions
        double exp1 = (x - y) / 2.0;
        double exp2 = (Math.pow(b, 2) - 4 * a * c) / (2 * a);
        double exp3 = (v * v) - (u * u);
        double exp4 = a * b - d;

        // Output
        System.out.println("\nResults:");
        System.out.println("(x - y)/2 = " + exp1);
        System.out.println("(b^2 - 4ac)/2a = " + exp2);
        System.out.println("v^2 - u^2 = " + exp3);
        System.out.println("a*b - d = " + exp4);
        sc.close();
    }
}
