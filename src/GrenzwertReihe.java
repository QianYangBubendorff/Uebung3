public class GrenzwertReihe {
    public static void main(String[] args) {
        System.out.println(sumMath());
    }
    public static double sumMath(){
        double sum=0;
        double current=0;
        for(int i=0; i<10000; i++){
            current= Math.pow(0.5, i);
            sum= current + sum;

            if(current< 0.0001){
            break;
            }
        }
        return sum;
    }

}
