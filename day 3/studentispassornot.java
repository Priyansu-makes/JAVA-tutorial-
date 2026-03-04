import java.util.*;

public class studentispassornot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject 1:");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int marks2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int marks3 = sc.nextInt();

        double total = marks1 + marks2 + marks3;
        double percentage = total / 3;

        if (marks1 >= 33 && marks2 >= 33 && marks3 >= 33 && percentage >= 40) {
            System.out.println("Student is PASS");
        } else {
            System.out.println("Student is FAIL");
        }
    

        
       

       



    }
    
}
