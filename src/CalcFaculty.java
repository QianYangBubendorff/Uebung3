public class CalcFaculty {
    public static void main(String[] args) {
        System.out.println(calcFaculty(12));
    }

    public static long calcFaculty(int value) {
        long fakultaet=1;
        for (int n = 0; n<=value; n++) {
            if (value == 0) {
                fakultaet=1;
            } else {
                fakultaet=calcFaculty(value - 1) * value;
            }

        }
        return fakultaet;
    }
}
