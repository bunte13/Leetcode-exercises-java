// package arrays;
import java.util.ArrayList;
import java.util.List;
import java.math.BigInteger;

public class Plus_One {
    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        int[] digitsAltered1 = plusOne1(digits); // raboti za site broevi pomal od ovoj
        int[] digitsAltered2 = plusOne2(digits); // raboti za site broevi
        for(int i = 0;i<digitsAltered1.length;i++){
            System.out.println(digitsAltered1[i]);
            
        }
        System.out.println(" ");
        for(int i = 0;i<digitsAltered2.length;i++){
            System.out.println(digitsAltered2[i]);
            
        }
    }
    public static int[] plusOne1(int[] digits){
        int fold = (int) Math.pow(10, digits.length - 1); 
        long result = 0;
        
        for(int  i = 0;i<digits.length;i++){
            result += fold * digits[i];
            fold = fold/10;
            
        }
        result++;
        
        int u = 0;
        int pom = (int)result;
        
        while(pom!=0){
            u++;
            pom = pom/10;
            
        }
        
        fold = (int) Math.pow(10,u-1);
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<u;i++){
            
            double en = result/fold;
            int n = (int) en;
            list.add(n);
            result = result%fold;
            fold= fold/10;
            
        }
        int niza[] = new int[list.size()];
        for(int i = 0;i<niza.length;i++){
            niza[i] = list.get(i);
        }
        return niza;
    }

    public static int[] plusOne2(int[] digits){
        BigInteger fold = BigInteger.TEN.pow(digits.length-1);
        BigInteger result = BigInteger.ZERO;
        
        for(int  i = 0;i<digits.length;i++){
            BigInteger digit = BigInteger.valueOf(digits[i]);
            result = result.add(fold.multiply(digit));
            fold = fold.divide(BigInteger.TEN);
            
        }
        result = result.add(BigInteger.ONE);
        String resultString = result.toString();
        
        int[] resultArray = new int[resultString.length()];
        for(int i = 0; i < resultString.length(); i++) {
            resultArray[i] = resultString.charAt(i) - '0';
        }
        
        return resultArray;
            
        }
}

