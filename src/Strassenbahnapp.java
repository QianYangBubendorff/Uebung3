public class Strassenbahnapp {
    public static void main(String[] args) {

        System.out.println(arrivalTime(6));
        System.out.println(wartezeitWarnung(6, 5));
    }


    public static String arrivalTime(int stationNumber) {
        String arrival;
        switch (stationNumber) {
            case 1 -> arrival = "Bei Station 1 sind es noch 20 Minuten";
            case 2 -> arrival = "Bei Station 2 sind es noch 16 Minuten";
            case 3 -> arrival = "Bei Station 3 sind es noch 15 Minuten";
            case 4 -> arrival = "Bei Station 4 sind es noch 10 Minuten";
            case 5 -> arrival = "Bei Station 5 sind es noch 3 Minuten";
            case 6 -> arrival = "Bei Station 6 sind es noch 1 Minute. Hier ist Ihre Ziel. Vegessen Sie nicht auszusteigen";
            default -> arrival = "null";
        }
        ;
        return arrival;

    }

    public static String wartezeitWarnung(int stationNumber, int dauerVonProblem) {
        String warning;
        switch (stationNumber) {
            case 1 -> warning = "Bei Station 1 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (20 + dauerVonProblem) + " Minuten";
            case 2 -> warning = "Bei Station 2 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (16 + dauerVonProblem) + " Minuten";
            case 3 -> warning = "Bei Station 3 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (15 + dauerVonProblem) + " Minuten";
            case 4 -> warning = "Bei Station 4 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (10 + dauerVonProblem) + " Minuten";
            case 5 -> warning = "Bei Station 5 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (3 + dauerVonProblem) + " Minuten";
            case 6 -> warning = "Bei Station 6 gibt es ein Stau von  " + dauerVonProblem + " und sind es noch " + (1 + dauerVonProblem) + " Minuten. Hier ist Ihre Ziel. Vegessen Sie nicht auszusteigen.";
            default -> warning = "null";
        }
        ;
        return warning;
    }
}





