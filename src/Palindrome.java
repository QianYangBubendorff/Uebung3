public class Palindrome {
    public static void main(String[] args) {
        System.out.println(reverseString("I am a cat"));
        System.out.println(isPalindrome("I am a cat"));
        System.out.println(isPalindrome("anna"));
    }

// method to reverse a String.

    public static String reverseString(String origS){
         String newS = new String();
        for(int i=0; i<origS.length();i++) {
        newS = newS + origS.charAt(origS.length()-i-1);
    }
        return newS;
    }
/* method to check if a String is a palindrome by comparing the old string with the reversed string with equals() method.
    public static boolean isPalindrome(String origS){
        String newS= new String();
        for(int i=0; i<origS.length();i++) {
            newS = newS + origS.charAt(origS.length()-i-1);
        }
        if(origS.equals(newS)){
            return true;
        } else return false;
    }*/

    //recursion method to check if the string is a palindrome.
    public static boolean isPalindrome(String potentialPalindrome) {
        /*potentialPalindrome = potentialPalindrome.toString();
        potentialPalindrome = potentialPalindrome.replace(",", "");
        potentialPalindrome = potentialPalindrome.replace("'", "");
        potentialPalindrome = potentialPalindrome.replace(" ", "");*/
        char firstLetter = potentialPalindrome.charAt(0);
        char lastLetter = potentialPalindrome.charAt(potentialPalindrome.length() - 1);
        if (firstLetter == lastLetter) {
            potentialPalindrome = potentialPalindrome.substring(1, potentialPalindrome.length() - 1);
            if (potentialPalindrome.length() <= 1) {
                return true;
            }
        return isPalindrome(potentialPalindrome);

        }
        return false;
    }

}
