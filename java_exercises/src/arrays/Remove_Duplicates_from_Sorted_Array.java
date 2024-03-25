// package arrays;
public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,3,3,4,4}; // Input array


int k = removeDuplicates(nums); // Calls your implementation


for (int i = 0; i < k; i++) {
     System.out.println(nums[i]); //gi prikazhuva za goleminata koja se vrakja od funckijata , a inache ima posle toa i drugi cifri
    }
}

public static int removeDuplicates(int[] nums){
    int slow = 0;
    for(int fast = 0;fast<nums.length;fast++){
        if(nums[fast] !=nums[slow]){
            slow++;
            if(slow != fast){ // da otide na sledno samo ako e razlichno
            nums[slow] = nums[fast];
            }
        }
    }
    return slow +1;
}
}
