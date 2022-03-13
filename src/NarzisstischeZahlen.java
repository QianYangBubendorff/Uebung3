import java.util.LinkedList;

public class NarzisstischeZahlen {
    public static void main(String[] args) {
        findNarzistisch(1, 1000);
    }
    public static void  findNarzistisch( int from, int until){
        for (int i = from; i <= until; i++) {
            int n = i;
            //create a Integer list with Linkedlist function by pushing the data.
            LinkedList<Integer> data = new LinkedList<>();
            while (n > 0) {
                data.push(n % 10);
                n = n / 10;
            }
            double sum = 0;
            // here ??? why sum=sum+ cannot replace sum+=?
            for (Integer num : data) {
                sum =sum+ Math.pow(num, data.size());
            }
            if (i == sum) {
                System.out.println(i);
            }
        }
    }
}
