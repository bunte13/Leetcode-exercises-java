// package arrays;



 //some random feeng problem i found online
//  find the unique element in a sorted array where all elements except one are repeated twice

//O(log n) (binary search algorithm)

public class Binary_search_random_exe {
    public static void main(String[] args) throws Exception {
        int[] nums = {1,1,3,3,4,4,5};
        System.out.println(display2(nums));
        System.out.println(display1(nums));
    }
    //O(log n) (binary search algorithm)
    public static int display2(int[] nums) {
        int right = nums.length - 1;
        int left = 0;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If nums[mid] is equal to either nums[mid - 1] or nums[mid + 1], 
            // adjust left and right pointers accordingly.
            if (nums[mid] == nums[mid - 1]) {
                if ((right - mid) % 2 == 0) { // If right - mid is even
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] == nums[mid + 1]) {
                if ((right - mid) % 2 == 0) { // If right - mid is even
                    left = mid + 2;
                } else {
                    right = mid - 1;
                }
            } else {
                return nums[mid]; // Unique element found
            }
        }
        return nums[left]; // Unique element found
    }

    //O(n) solution (by me)
    public static int display1(int[] nums){
    
    for(int i = 0;i<nums.length;i++){
        int segashna = nums[i];
        if(i == 0){
            if(segashna != nums[i+1]){
                return nums[i]; 
            }
        }
        if(i < nums.length-1 && i>0){
        if(segashna != nums[i+1] && segashna != nums[i-1]){
            return nums[i]; 
            }
        }
        if(i == nums.length-1){
            if(nums[i] != nums[i-1]){
                return nums[i];
            }
        }
    }
    return 0;


}
}
