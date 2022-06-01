package Level2.Parentheses;
/*
task: return true if a string of parentheses are 'valid'. false if not.
parentheses are valid if all opening parentheses are closed and if no parentheses are closed without being first opened.
eg, valid:
(())
()()
(()())
invalid:
)(
(()
))
 */

public class Parentheses {
    public boolean checkParentheses(String in){
        boolean needMatch = false; // true if we have any open parenthesis that need matches
        int matchCount = 0; // counts how many open parenthesis need matches
        for(int i = 0; i < in.length(); i++){
            System.out.println("\n------------------------------------------------------------");
            if (i == in.length()-1){
                System.out.println("I have reached the last char, charAt[" + i + "]");
                System.out.println("Char at [" + i + "] = " + in.charAt(i));
                System.out.println("matchCount = " + matchCount + ", needMatch = " + needMatch);
            }
            if(in.charAt(i) == '('){
                System.out.println("Char at [" + i + "] = (");
                System.out.println("needMatch = " + needMatch + "-> ");
                needMatch = true;
                System.out.print("" + needMatch + "\n");
                System.out.println("matchCount: " + matchCount + "-> ");
                matchCount++;
                System.out.print(matchCount + "\n");

            } else if (in.charAt(i) == ')') {
                System.out.println("Char at [" + i + "] = )");
                if (!needMatch) {
                    System.out.println("needMatch is false, so returning false.");
                    return false;
                } else {
                    System.out.println("needMatch is true, so removing 1 from matchCount.");
                    System.out.println("matchCount: " + matchCount + "-> ");
                    matchCount = matchCount - 1;
                    System.out.print(matchCount + "\n");
                    if (matchCount == 0) {
                        needMatch = false;
                    }
                }
            }
        }
        System.out.println("matchCount = " + matchCount + ", needMatch = " + needMatch);
        if(matchCount == 0 && !needMatch){
            System.out.println("matchCount ==  0 and we do not need any more matches, so I'm returning true.");
            return true;
        } else {
            System.out.print("Returning false outside of loop.");
            return false;
        }
    }
}
