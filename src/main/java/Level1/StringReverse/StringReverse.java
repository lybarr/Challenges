package Level1.StringReverse;
/*
task: return the reverse of a string.
 */

public class StringReverse {
    public String reverse(String s){
        String newString = "";
        for(int i = s.length()-1; i >= 0; i--){
            newString = newString + s.charAt(i);
        }
        return newString;
    }
}
