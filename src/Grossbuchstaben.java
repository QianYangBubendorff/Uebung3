public class Grossbuchstaben {
    public static void main(String[] args) {
        System.out.println(grossBuchStaben("i am one cat"));


    }
    public static String grossBuchStaben(String original){
        String newStr= new String();
        char c =' ';


        for(int i=0; i<original.length(); i++){
            c = original.charAt(i);
            if(i==0 ||(i>0 && original.charAt(i - 1) == ' ')) {
                c = Character.toUpperCase(original.charAt(i));
            }

            newStr = newStr + c;
        }
        return newStr;
    }

}