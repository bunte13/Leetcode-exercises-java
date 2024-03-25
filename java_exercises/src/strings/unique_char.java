package strings;

import java.util.HashMap;

public class unique_char {
    public static void main(String[] args) {
        String s = "nenade";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s){
        HashMap<Character,Integer> frequencyMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0)+1);

        }
        for(int i = 0;i<s.length();i++){
            if(frequencyMap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
