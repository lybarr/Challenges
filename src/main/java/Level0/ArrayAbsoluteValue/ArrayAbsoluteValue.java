package Level0.ArrayAbsoluteValue;
/*
task: return an array of the absolute values of all numbers (distance from zero, eg abs of 4 is 4, abs of -3 is 3)
 */
public class ArrayAbsoluteValue {

    public int[] getArrayAbs(int[] nums){

        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){
            if(nums[i] < 0){
                result[i] = nums[i] * -1;
            } else {
                result[i] = nums[i];
            }
        }
        return result;
    }
}