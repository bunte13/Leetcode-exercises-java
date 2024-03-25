// package arrays;
/**
 * leetcode_6
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Intersection_of_Two_Arrays_II {

    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};
        
        int[] nums4 = intersect2(nums1,nums2);
       
        for(int i = 0;i<nums4.length;i++){
            System.out.println(nums4[i]);
        }
        System.out.println( " ");
        int[] nums3 = intersect1(nums1,nums2);
        for(int i = 0;i<nums3.length;i++){
            System.out.println(nums3[i]);
        }
    }
    public static int[] intersect1(int[] nums1, int[] nums2){
        int nums3[] = new int[10];
        int k = 0;
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i] == nums2[j]){
                    nums3[k] = i; 
                    nums2[j] = ' ';
                    k++;
                    break;
                }
            }
        }
        int[] nums4 = new int[k];
        for(int i = 0;i<k;i++){
            nums4[i] = nums1[nums3[i]]; 
        }
        return nums4;
    }
    public static int[] intersect2(int[] nums1, int[] nums2){
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for(int num : nums1){
            frequencyMap.put(num,frequencyMap.getOrDefault(num, 0)+1); // naogja eden element i potoa  za da odredime dali og ima poishe od 1 , go pravime, ako go nema stavame 1;
        }
        List<Integer> inters = new ArrayList<>();
        for(int num:nums2){
            if(frequencyMap.containsKey(num) && frequencyMap.get(num)>0){
                inters.add(num);
                frequencyMap.put(num, frequencyMap.get(num)-1); // go namaluvame za edno zachestenosta na ovoj element 

            }
        }
        int result[] = new int[inters.size()];
        for(int i = 0;i<result.length;i++){
            result[i] = inters.get(i);
        }
        return result;

    }

}