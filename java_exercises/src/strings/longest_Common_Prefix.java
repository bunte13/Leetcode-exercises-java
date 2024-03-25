package strings;

import java.util.ArrayList;
import java.util.List;

public class longest_Common_Prefix {

public static void main(String[] args) {
    String[] strs = {"flower","flow","flight"};
    String neshto = longestCommonPrefix(strs);
    System.out.println(neshto);
}   
public static String longestCommonPrefix(String[] strs){
    List<Character> lista = new ArrayList<>();
    for(int i = 0;i<strs[0].length();i++){
       lista.add(strs[0].charAt(i));
    }
    for(int i = 1;i<strs.length;i++){
        int j = 0;
        while(j<lista.size() && j<strs[i].length()){
            if (lista.get(j) != strs[i].charAt(j)) {
                lista.subList(j, lista.size()).clear();
                break;
            }
            j++;
        }
        if (j < lista.size()) {
            lista.subList(j, lista.size()).clear();
        }
     }
     StringBuilder sb = new StringBuilder(lista.size());
     for(char c: lista){
        sb.append(c);
     }
     return sb.toString();
     
}
}
