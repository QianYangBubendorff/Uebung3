import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 3, 4, 10}, {3, 4, 5}};
        System.out.println(Arrays.toString(getFlatArray(arr)));


    }

    public static int[] getFlatArray(int[][] numbers) {

        // Retrieve total length of parameter array
        int ln = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                ln++;
            }
        }

        // Creating new array which combine the number of the 2D array with the length l.
        int[] arr2 = new int[ln];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                arr2[k] = numbers[i][j];
                k++;
            }


        }
        return arr2;
    }
}

    //new method to move the duplicate numbers to the end of the array and replace with value -1.
//    public static int[] removeDuplicate(int[][] numbers) {
//
//        // Creating new array which combine the number of the 2D array with the length l.
//        Arrays.toString(getFlatArray(numbers));
//        int[] arr3 = new int[numbers.length];
//        for (int i = 0; i < numbers.length; l++) {
//            arr3[i] = -1;
//        }
//        for (int i = 0; i < numbers.length; i++) {
//            for(int j =0; j<arr3.length; j++){
//                if (numbers[i] != arr3[j])
//                    arr3[i] = numbers[i];
//
//                }
//
//
//            }
//
//        }
//        return arr3;
//    }
//}

