public class Primefactor {
    public static void main(String[] args) {
        System.out.println(findBiggestPf(600851475143L));
    }

    public static long findBiggestPf(long number) {
        for(long i=2; i<=number/2; i++){

            if(number%i==0){
                number=number/i;
            }
        }

        return number;
    }
    }



