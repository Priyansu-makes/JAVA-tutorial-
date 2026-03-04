public class expression {
    public static void main(String[] args) {
        java.util.Scanner sc =new java.util.Scanner(System.in);
        System.out.println("the value of v,u,a =");
        int v =sc.nextInt();
        int u = sc.nextInt();
        int a = sc.nextInt();
        double expression =(double) (Math.pow(v, 2) * Math.pow(u, 2)) / (2 * a);
        System.out.println("the ans will be ="+expression);


        
    
}
}