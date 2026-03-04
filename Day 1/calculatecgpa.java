import java.util.Scanner;

public class calculatecgpa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double marks1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double marks2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double marks3 = sc.nextDouble();

        double total = marks1 + marks2 + marks3;
        double cgpa = (total / 300) * 10;

        System.out.println("Your CGPA = " + cgpa);
    }
}