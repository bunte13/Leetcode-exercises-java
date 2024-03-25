// package sorting and searching;

public class merge_sorted_array {
    public static void main(String[] args) {
        int m = 5;
        int n = 3;
        int[] nums2 = new int[n];
        int[] nums1 = new int[nums2.length+m];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        nums1[3] = 4;
        nums1[4] = 5;
        // merge1(nums1,m,nums2,n); //defektno
        merge(nums1, m, nums2, n);

        for(int i = 0;i<nums1.length;i++){
            System.out.println(nums1[i]);
        }
        // for(int i = 0;i<nums1.length;i++){
        //     System.out.println(nums2[i]);
        // }

    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) { //kako inicijalno probav
        
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(nums1[i]>nums2[j]){
                    for(int u = nums1.length-1;u>i;u--){
                        nums1[u] = nums1[u-1]; 
                    }
                    nums1[i] = nums2[j]; 
                    break;
                }
                
            }
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n){ // kako e najbrzo i najdobro
        int i = m-1;
        int j = n-1;
        int p = m+n-1;
        while(i>=0 && j>= 0){
            if(nums1[i] > nums2[j]){ // ako element od krajot na prvana niza e pogolem od vtoriot
                nums1[p--] = nums1[i--]; // stavi go na kraj posledno mesto vo istata niza i namali gi za edno poziciite na pointerot kon posledniot element od originalnata niza i od novata
            }else{
                nums1[p--] = nums2[j--]; // ako ne namali og od originalnata i od drugata niza 
            }
            //wouldnt be possible if both arrays werent sorted
        }
        while(j>= 0){ // ako ne sme stignale do pochetokot na niza 2 togash znaeme deka site elementi do koi ne sme stignale se poniski ili isti so najmaliot element od niza 1(originalnata)
            nums1[p--] = nums2[j--];
        }
    }

}
