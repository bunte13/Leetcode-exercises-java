// package arrays;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int[] nums2 = {1,2,3,4};
        if(containsDuplicate2(nums1)){
            System.out.println("duplicate");
        }else{
        System.out.println("no duplicate");
        }
        if(containsDuplicate2(nums2)){
            System.out.println("duplicate");
        }else{
        System.out.println("no duplicate");
        }
    }

    public static boolean containsDuplicate(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean containsDuplicate2(int nums[]){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : nums){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0)+1);
        }
        for(int num : nums){
            if(frequencyMap.get(num)>1){
                return true;
            }
        }
        return false;
        
    }
}
