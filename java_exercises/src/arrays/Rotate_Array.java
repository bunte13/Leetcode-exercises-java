// package arrays;
public class Rotate_Array {
    public static void main(String[] args) {
        
    
    int[] nums = {1,2,3,4,5,6};
    int k = 2;
    // rotate1(nums, k);
    // for(int i = 0;i<nums.length;i++){
    //     System.out.println(nums[i]);
    // }
    rotate2(nums, k);
    for(int i = 0;i<nums.length;i++){
        System.out.println(nums[i]);
    }
    // System.out.println(nums[nums.length-1]);
}

public static void rotate1(int[] nums, int k) {
    for(int i = 0;i<k;i++){
        int pos = nums[nums.length-1];
        for(int j = nums.length-1;j>0;j--){
            nums[j] = nums[j-1];
        }
        nums[0] = pos;
    }
}
public static void rotate2(int[] nums, int k) {
    while(k>0){
        int pos = nums[nums.length-1];
        int p = nums.length-1;
        while(p>=1){
            
            nums[p] = nums[p-1];
            p--;
           
        }
        nums[0] = pos;
        k--;
    }
}
}
 // exceeds time limit on leetcode