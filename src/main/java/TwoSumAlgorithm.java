

public class TwoSumAlgorithm {

    public int[] getTwoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            int difference = target - nums[i];
            for( int j = i +1, k = nums.length - 1; j <= k; j++, k--) {
                if( nums[j] == difference) {
                    return new int[] {i, j};
                }
                if(nums[k] == difference) {
                    return new int[] {i, k};
                }
            }
        }
        return null;
    }

}
