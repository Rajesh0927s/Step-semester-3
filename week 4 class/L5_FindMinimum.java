public class L5_FindMinimum {

    public static int findMin(int[] nums) {

        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] nums = {3, 4, 5, 1, 2};

        System.out.println(findMin(nums));
    }
}