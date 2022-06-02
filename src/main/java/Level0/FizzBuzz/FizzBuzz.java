package Level0.FizzBuzz;
/*
task: if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
divisible by both, return 'FizzBuzz'.
 */
public class FizzBuzz {
    public String FizzBuzzGen(int n){
        if (n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz";
        } else if(n % 3 == 0){
            return "Fizz";
        } else if (n % 5 == 0){
            return "Buzz";
        } else {
            return ""; // No Fizz nor Buzz.
        }
    }
}
