// package arrays;
public class Single_Number {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2};
        int n = singleNumber(nums);
        System.out.println(n);
    }
    public static int singleNumber(int[] nums){
        int result = 0;
        for(int i = 0;i<nums.length;i++){
            result ^= nums[i];
        }
    return result;
    }
}
