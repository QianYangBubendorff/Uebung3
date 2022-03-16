import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 3, 4, 10}, {3, 4, 5}};
        System.out.println(Arrays.toString(getFlatArray(arr)));
        System.out.println(Arrays.toString(removeDuplicate(arr)));

    }

    public static int[] getFlatArray(int[][] numbers) {

        // Retrieve total length of parameter array
        int l = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                l++;
            }
        }

        // Creating new array which combine the number of the 2D array with the length l.
        int[] arr2 = new int[l];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                arr2[k] = numbers[i][j];
                k++;
            }


        }
        return arr2;
    }

    //new method to move the duplicate numbers to the end of the array and replace with value -1.
    public static int[] removeDuplicate(int[][] numbers) {
        // Retrieve total length of parameter array
        int l = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                l++;
            }
        }

        int[] arr2 = new int[l];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                arr2[k] = numbers[i][j];
                k++;
            }
        }
        // Creating new array which combine the number of the 2D array with the length l.
        int[] arr3 = new int[l];
        for (int i = 0; i < l; l++) {
            arr3[i] = -1;
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    arr3[j] = -1;

                }else arr3[i]= arr2[i];


            }

        }
        return arr3;
    }
}

