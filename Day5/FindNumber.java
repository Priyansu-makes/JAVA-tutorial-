import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {

        int[] array = {11, 12, 14, 12, 15};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to search: ");
        int num = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == num){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Number is present in the array");
        } else {
            System.out.println("Number is NOT present in the array");
        }

        sc.close();
    }
}
    

