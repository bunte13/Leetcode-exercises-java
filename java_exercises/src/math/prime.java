package math;

import java.util.Arrays;

public class prime {
    public static void main(String[] args) {
        // System.out.println(3%1);
        int n = 1500;
        System.out.println(countPrimes1(n));
        System.out.println(countPrimes2(n));
    }

    public static int countPrimes1(int n) {
        int counter = 0;
        
        for(int j = 2;j<n;j++){
            Boolean prime = true;
            for(int i = 2;i<=Math.sqrt(j);i++){
                if(j%i == 0){
                    prime = false;
                    break;
                }
                
            }
            if(prime){
                counter++;
            }
        }
        return counter;
        
    }
    public static int countPrimes2(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    
    for (int i = 2; i * i < n; i++) {
        if (isPrime[i]) {
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
    }
    
    int count = 0;
    for (int i = 2; i < n; i++) {
        if (isPrime[i]) {
            count++;
        }
    }
    
    return count;
}

}
