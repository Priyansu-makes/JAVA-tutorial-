import java.util.*;

public class DetectTripleOrDoubleSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        if (str.contains("   ")) {
            System.out.println("It has triple space");
        } 
        else if (str.contains("  ")) {
            System.out.println("It has double space");
        } 
        else {
            System.out.println("No double or triple spaces found");
        }
    }
}

        
    
    

