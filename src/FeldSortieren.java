import java.util.Arrays;

public class FeldSortieren {
    public static void main(String[] args) {
        int[] ints = {9, 7, 8, 3, 1};
        arrangeOrder(ints);
    }

    public static void arrangeOrder(int[] numbers) {
        int temp = 0;
            for (int i = 0; i < numbers.length; i++) {
                for(int j=i+1; j< numbers.length; j++){

                if (numbers[i] > numbers[j]) {
                    temp=numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

                }
            }
        System.out.println(Arrays.toString(numbers));
        }


    }

