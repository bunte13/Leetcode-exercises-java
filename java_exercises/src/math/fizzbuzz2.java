package math;

import java.util.ArrayList;
import java.util.List;

public class fizzbuzz2 {
    public static void main(String[] args) {
    
    int n = 16;
    List<String> nums = fizzBuzz(n);
    for(int i = 0;i<nums.size();i++){
        System.out.println(nums.get(i));
    }
    
    }

    public static List<String> fizzBuzz(int n) {
        List<String> nums = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(i%3 == 0 && i%5 == 0){
                nums.add("fizzbuzz");
                continue;
            }
            if(i%3 == 0){
                nums.add("fizz");
                continue;
            }
            if(i%5 == 0){
                nums.add("buzz");
                continue;
            }
            String val = String.valueOf(i);
            nums.add(val);
        }
        return nums;
    }
    

}
