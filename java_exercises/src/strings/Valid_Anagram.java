package strings;
import java.util.HashMap;

public class Valid_Anagram {
    public static void main(String[] args) {
        String s = "rambo";
        String t = "obmar";
        if(isAnagram(s,t)){
            System.out.println("anagram e");
        }else{
            System.out.println("ne e");
        }

    }
    public static boolean isAnagram(String s, String t){
        HashMap<Character,Integer>mapa1 = new HashMap<>();
        for(char c: s.toCharArray()){
            mapa1.put(c, mapa1.getOrDefault(c, 0)+1);
        }
        HashMap<Character,Integer>mapa2 = new HashMap<>();
        for(char c: t.toCharArray()){
            mapa2.put(c, mapa2.getOrDefault(c, 0)+1);
        }
        if(mapa1.equals(mapa2)){ // alp imaat isti key value pairs , znachi za sekoj bara kolku pati se pojavuva gore a dole sporeduva
            return true;
        }
        return false;
    }
}
