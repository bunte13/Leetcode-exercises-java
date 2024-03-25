// package arrays;
// import java.util.ArrayList;
import java.util.HashMap;
// import java.util.List;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {3,2,5,4};
        int target = 6;
        int []sol = twoSum(nums,target);
        for(int i=0;i<sol.length;i++){
            System.out.println(sol[i]);
        }
    }
    //da napravime hashmapa kade shto za skoj kluc kje ima vrednost onolkava kolkun mu treba za da se dobie baraniot broj, potoa kje prebarame ushte ednash niz nizata za da go dobieme
    public static int[] twoSum(int[] nums, int target) {
        int[] n = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], i);
        }
        for(int i = 0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i){
                n[0] = i;
                n[1] = map.get(complement);
                break;
            }
            
        }
        
        return n;
}
}
