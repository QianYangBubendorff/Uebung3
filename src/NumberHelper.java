import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int [][] arr3= new int[][] {{0,1,9},{3,4,5}};
     System.out.println(Arrays.toString(getFlatArray(arr3)));

    }

    public static int[] getFlatArray(int[][] numbers) {
        int[][] arr1 = new int[][];
        int[] arr2 = new int[];
        int k=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[k] = arr1[i][j];
                k++;
            }


        }
        return arr2;
    }
}
