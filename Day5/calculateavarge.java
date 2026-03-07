public class calculateavarge {
    public static void main(String[] args) {
        double []marks ={78.6,76.7,75,45};
        double sum= 0;
        double avg =0;
        for (double i :marks){
             sum =sum+i;
             avg =sum/marks.length;

        }
        System.out.println(avg);
    }
    
}
