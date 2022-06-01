package Level2.MoveZeroes;
/*
Task:
move all zeroes in an array to the end of the array and return the new array. see test cases.
 */
public class MoveZeroes {
    public int[] move(int[] nums){
        int zeroCount = 0;
        int arrCount = 0;
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount++;
            } else {
                result[arrCount] = nums[i];
                arrCount++;
            }
        }
        for(int i = nums.length-zeroCount; i < nums.length; i++){
            result[i] = 0;
        }

        return result;
    }
}
