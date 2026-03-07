import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean is_prime = true;

        for(int i = 2; i < n; i++) {
            if(n % i == 0){
                is_prime = false;
                break;
            }
        }

        if(is_prime){
            System.out.println("It is prime");
        }
        else{
            System.out.println("It is not prime");
        }

        sc.close();
    }
}