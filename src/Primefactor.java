import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primefactor {
    public static void main(String[] args) {
        System.out.println(findBiggestPrimeFactor(13195));
        }

    public static int findBiggestPrimeFactor(int number){
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            list1.add(i);
        }
    }
        int biggestfactor=0;
        for(int i= list1.size()-2; i>=0; i--) {
        for(int j=2; j<=list1.get(i)/2; j++){
            if(list1.get(i)% j!=0 ){
                biggestfactor=list1.get(i);
                return biggestfactor;
            }
        }
        }
        return biggestfactor;
    }
}



