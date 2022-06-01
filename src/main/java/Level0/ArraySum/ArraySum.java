package Level0.ArraySum;
/*
task: return the sum of all values in int array.
 */

public class ArraySum {
    public int sum(int[] arr){
        int result = 0;

        for(int i = 0; i < arr.length; i++){
            result = result + arr[i];
        }
        return result;
    }
}
