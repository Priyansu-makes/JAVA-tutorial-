public class addtwo {
    public static void main(String[] args) {

        int[][] m1 = {{1,2,3},{4,5,6}};
        int[][] m2 = {{1,2,3},{4,5,6}};

        int[][] sum = new int[2][3];

        for(int i = 0; i < m1.length; i++){
            for(int j = 0; j < m1[i].length; j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i = 0; i < sum.length; i++){
            for(int j = 0; j < sum[i].length; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}