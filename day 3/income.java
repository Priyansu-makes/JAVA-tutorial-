public class income {
    public static void main(String[] args) {
        java.util.Scanner Sc=new java.util.Scanner(System.in);
        int income = Sc.nextInt();
        int tax=0;
        if(income>=2.5 && income<=5.0){
            int total_tax =income*5/100;
        }
        else if(income>=5.0 && income<=10.0){
             int total_tax =income*20/100;

        }
        else if ( income>=10.0){
            int total_tax=income*30/100;


        }
        else{
            System.out.println("");
        }
        



    }
    
}
