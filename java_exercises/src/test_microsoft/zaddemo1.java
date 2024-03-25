// package test_microsoft;

public class zaddemo1 {
    public static void main(String[] args) {
        int[] niza = {-1000000,3,-1000000};
        int a = solution(niza);
        System.out.println(a);
    }

    public static int solution(int[] A) {
        boolean[] najdeni = new boolean[A.length+2];
        for(int i = 0;i<A.length;i++){
            int num = A[i];
            if(num >= 0 && num<= A.length){
                najdeni[num] = true;
            }
        }
        for(int i = 1;i<=A.length+1;i++){
            if(najdeni[i] == false){
                return i;
            }
        }
        return -1;
    }
}
