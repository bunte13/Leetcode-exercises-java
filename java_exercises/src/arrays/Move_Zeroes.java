// package arrays;
public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums2 = {0,0,2,0,1,2}; // treba da se dobie = {1,2,4,6,0,0}
        moveZeroes(nums2);
        for(int i = 0;i<nums2.length;i++){
            System.out.println(nums2[i]);
        }
    }

    public static void moveZeroes(int[] nums){
        int nonZeroIndex = 0; 
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }

        }
        while (nonZeroIndex<nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
