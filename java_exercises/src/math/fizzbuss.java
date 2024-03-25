package math;

public class fizzbuss {
    public static void main(String[] args) {
        int[] niza = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0;i<niza.length;i++){
            if(niza[i]%3 == 0 && niza[i]%5 == 0){
                System.out.println("fizzbuzz");
                continue;
            }
            if(niza[i]%3 == 0){
                System.out.println("fizz");
                continue;
            }
            if(niza[i]%5 == 0){
                System.out.println("buzz");
                continue;
            }
            System.out.println(niza[i]);
        }
    }
}
