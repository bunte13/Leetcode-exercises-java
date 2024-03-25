package strings;

import java.util.ArrayList;
import java.util.List;

public class Valid_Palinfrome {
    public static void main(String[] args) {
        String s = "ma:r%KOokramm";
        
        if(isPalindrome(s)){
            System.out.println("palindrom e");
        }else{
            System.out.println("ne e");
        }
    }
    public static boolean isPalindrome(String s){
        List<Character> list = new ArrayList<>();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                char p = Character.toLowerCase(c);
                list.add(p);
            }
        }
        
        int i = list.size()-1;
        int j = 0;
        while(j<i){
            if(list.get(i) != list.get(j)){
                return false;
            }
            i--;
            j++;
            
        }
        
        
        return true;
    }
}
