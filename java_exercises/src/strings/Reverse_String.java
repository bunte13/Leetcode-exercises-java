package strings;

public class Reverse_String {
    public static void main(String[] args) {
        char[] s = {'n','e','s','t','o'};
        reverse(s);
        for(int i = 0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }

    public static void reverse(char s[]){
        for(int i = 0,j=s.length-1;i<s.length/2;i++,j--){
            char pom = s[j];
            s[j] = s[i];
            s[i] = pom; 

        }
    }

}
