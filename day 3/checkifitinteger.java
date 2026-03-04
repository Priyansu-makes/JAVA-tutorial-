import java.util.Scanner;

public class checkifitinteger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        if(sc.hasNextInt()) {
            int number = sc.nextInt();
            System.out.println("The entered number is integer = " + number);
        }
        else {
            System.out.println("The input is NOT an integer");
        }
    }
}