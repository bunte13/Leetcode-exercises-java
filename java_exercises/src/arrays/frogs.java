// package arrays;
//broj na listovi shto nema da bidat stapnati od zhabi dadeni vo niza od koja mozhe da se vidi kolku zhabi ima i za sekoja zhaba sila na skkokanje
import java.util.Arrays;

public class frogs {

    public static void main(String[] args) {
        int leaves = 6; //broj na listovi
        int[] frogs = {5,2,3}; // jacina na skokanje odednash na sekoja zhaba i broj na zhabi
        System.out.println("nema da bidat stapnati volku listovi:");        
        
        System.out.println(untouched(frogs.length,leaves,frogs));
    }

    public static int untouched(int N,int leaves,int frogs[]){
        int[] array = new int[leaves];
        Arrays.fill(array, 0);
        int count = 0;
        for(int i = 0;i<frogs.length;i++){
            int sum = frogs[i]; // kade kje skokne prvata zhaba
            if(array[sum] == 0){
                array[sum] = 1;
            }
            while(sum < leaves){
                sum = sum+frogs[i]; //dodeka ne stigne do krajot kje skoka kolku shto mozhe da skokne od ednash dur ne premine
                if(sum >= leaves){
                    break;
                }
            if(array[sum] == 0){
                array[sum] = 1;
            }
        }
            
        }
       
        for(int i = 0;i<array.length;i++){
            if(array[i] == 1){
                count++;
            }
        }
        return leaves-count;
    }
}


    

    
