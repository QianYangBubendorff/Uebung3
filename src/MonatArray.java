public class MonatArray {
    public static void main(String[] args) {
        String[] MonthName= {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for(int i=0; i<MonthName.length; i++){
            System.out.println(MonthName[i] + "[" + (i+1) + "]");
        }
    }
}
