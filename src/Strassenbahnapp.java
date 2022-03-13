public class Strassenbahnapp {
    public static void main(String[] args) {
        System.out.println(arrivalTime(6));
    }
    public static String arrivalTime(int stationNumber){
        String arrival;
        switch(stationNumber){
        case 1-> arrival="Bei Station 1 sind es noch 20 Minuten";
        case 2-> arrival="Bei Station 1 sind es noch 16 Minuten";
        case 3-> arrival="Bei Station 1 sind es noch 15 Minuten";
        case 4-> arrival="Bei Station 1 sind es noch 10 Minuten";
        case 5-> arrival="Bei Station 1 sind es noch 3 Minuten";
        case 6-> arrival="Bei Station 1 sind es noch 1 Minute. Hier ist Ihre Ziel. Vegessen Sie nicht auszusteigen";
        default -> arrival="null";
        };
        return arrival;

    }
   // public static String wartezeitWarnung(int stationNumber, int dauerVonProblem){}



}
