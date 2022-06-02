package Level0.ReturnLongestString;

public class ReturnLongestString {
    public String longest(String[] s){
        int max = 0;
        int indexTracker = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].length() > max){
                max = s[i].length();
                indexTracker = i;
            }
        }
        return s[indexTracker];
    }
}
