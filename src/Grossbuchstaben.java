public class Grossbuchstaben {
    public static void main(String[] args) {
        System.out.println(grossBuchStaben("I am one cat"));


    }
    public static String grossBuchStaben(String original){
        String newStr= new String();
        char c =' ';
        newStr = newStr + original.charAt(0);

        for(int i=1; i<original.length(); i++){
            c = original.charAt(i);

                if (original.charAt(i - 1) == ' ') {
                    c = Character.toUpperCase(original.charAt(i));
                }

            newStr = newStr + c;
        }
        return newStr;
    }

}
