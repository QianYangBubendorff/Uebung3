import java.util.LinkedList;

public class NarzisstischeZahlen {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(153));
        printArmstrongNumberList(1, 10000);
    }

    //    public static void findNarzistisch(int from, int until) {
//        for (int i = from; i <= until; i++) {
//            int n = i;
//            //create a Integer list with Linkedlist function by pushing the data.
//            LinkedList<Integer> data = new LinkedList<>();
//            while (n > 0) {
//                data.push(n % 10);
//                n = n / 10;
//            }
//            double sum = 0;
//            // here ??? why sum=sum+ cannot replace sum+=?
//            for (Integer num : data) {
//                sum = sum + Math.pow(num, data.size());
//            }
//            if (i == sum) {
//                System.out.println(i);
//            }
//        }
//    }
// first find out the length of the number. Create a temp of the value of the number. Number divided by 10, if still bigger than 0, then the length increased by one.
    public static boolean isArmstrongNumber(int number) {
        int numberLength = 0, numberTemp = number;
        while (numberTemp > 0) {
            numberLength++;
            numberTemp = numberTemp / 10;
        }
//r is each factor of the number, subSum=factor powered by the length of the number.
// the copyNumber is the value of the original number because we lost the number value with the length calculation method.
        int r, sum = 0;
        int copyNumber = number;
        while (copyNumber > 0) {
            r = copyNumber % 10;
            int subSum = 1;
            for (int i = 0; i < numberLength; i++) {
                subSum = subSum * r;
            }
//        sum is the total of the subSum.
            sum = sum + subSum;
            copyNumber = copyNumber / 10;
        }
        boolean result;
        if (sum == number) {
            result = true;
        } else {
            result = false;

        }
        return result;
    }

    public static void printArmstrongNumberList(int from, int to) {

        for (int i=from; i <= to; i++) {
            if (isArmstrongNumber(i) == true) {
                System.out.println(i);
            }

        }
    }
}


