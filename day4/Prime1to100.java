// check 1 to 100 is prime or not 
public class Prime1to100 {

    public static void main(String[] args) {

        for(int n = 2; n <= 100; n++) {

            boolean is_prime = true;

            for(int i = 2; i < n; i++) {

                if(n % i == 0) {
                    is_prime = false;
                    break;
                }
            }

            if(is_prime) {
                System.out.println(n + " is prime");
            }
        }

    }
}
