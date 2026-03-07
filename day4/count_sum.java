public class count_sum {
    public static void main(String[] args) {
        int n=123654;
        int count =0;
        int sum =0;
        while(n!=0){
            int rem =n%10;
            sum=sum+rem;
            n=n/10;
            
            count++;
            
        }
        System.err.println(" sum will be = "+sum);
        System.out.println("count will be ="+count);
        

    }
    
}
