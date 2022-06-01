package Level0.Average;
//Task: return the average of an array of ints as a double.
public class Average {
    public double getAvg(int[] nums){
        int sum = 0;
        double result = 0;

        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        result = (double)sum / nums.length;

        return result;
    }
}
