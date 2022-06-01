package Level1.LargestSum;
/*
Task:
get the largest possible sum that can be obtained from a pair of values in the array.
 */
public class LargestSum {
    int current = 0;
    boolean sorting = true;
    int sum = 0;

    public int bigSum(int[] num){
        int max = Integer.MIN_VALUE;
        // i = index of the first value we are comparing
        for(int i = 0; i < num.length; i++){
            // j = index of the second value we are comparing
            for(int j = 0; j < num.length; j++){
                // check that we're not comparing the same value
                if(i != j){
                    // check if we've found a new max
                    if(num[i] + num[j] > max){
                        max = num[i] + num[j];
                    }
                }
            }
        }
        return max;
    }
}
