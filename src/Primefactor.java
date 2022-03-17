public class Primefactor {
    public static void main(String[] args) {
        System.out.println(findBiggestPf(50));
    }

    public static int findBiggestPf(int number) {
        int a = 0;
        int[] list = new int[a];
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
               list[a]=i;
                a++;
            }
        }
        int temp = 0;
        for (int i = 0; i < list.length; i++) {
            temp = list[i];
            if (list[i] < list[i + 1]) {
                list[i + 1] = list[i];
                list[i + 1] = temp;
            }
        }
        return temp;


    }
}


