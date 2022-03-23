import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{0, 3, 4, 10, 3, 3}, {3, 4, 6}};
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
        int[] arr3 = new int[arr2.length];
        boolean found = false;
// initialize all arr3 elements with value -1.
        int n = 0;
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = -1;
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr3.length && !found; j++) {

                if (arr2[i] == arr3[j]) {
                    found = true;
                }
            }
            if (!found) {
                arr3[n] = arr2[i];
                n++;
            }
            found=false;
        }
            return arr3;
        }
    }



