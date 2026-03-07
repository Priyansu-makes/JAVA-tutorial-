public class factorial {

    public static void main(String[] args) {
        java.util.Scanner Sc=new java.util.Scanner(System.in);
        
        int n =Sc.nextInt();
        int mul=1;
        for(int i=1;i<=n;i++){
            mul=mul*i;

        }
        System.out.println("ans fact  will be = "+mul);
        Sc.close();
    }
}