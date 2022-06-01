package Level1.InsertPosition;
/*
task: return the position that a number should be inserted into a sorted array (see test cases)
 */

public class InsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target < nums[i]){
                return i;
            } else {
                if (target == nums[i]) {
                    return i;
                }
            }
        }
        return nums.length;
    }
}
