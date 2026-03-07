import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int position = 1;
        int inverse = 0;

        while(num != 0){
            int digit = num % 10;

            inverse = inverse + position * (int)Math.pow(10, digit - 1);

            num = num / 10;
            position++;
        }

        System.out.println("Inverse: " + inverse);

        sc.close();
    }
}