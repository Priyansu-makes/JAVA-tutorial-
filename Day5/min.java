public class min {
    public static void main(String[] args) {

        int[] array = {25,11,12,15,24};
        int min = array[0];

        for(int num : array){
            if(min > num){
                min = num;
            }
        }

        System.out.println("Minimum = " + min);
    }
}
