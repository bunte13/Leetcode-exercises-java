public class first_bad_version { // nauchi go ovoj bnary search
    public static void main(String[] args) {
        first_bad_version fbv = new first_bad_version();
        int n = 100;
        System.out.println(fbv.firstBadVersion(n));
    }
    public boolean isBadVersion(int n){
        if(n >= 22){
        return true;
        }
        return false;
    }
    public int firstBadVersion(int n) {     //  basic binary search algorithm
        int left = 1;
        int right = n;
    
        while (left < right) {
            int mid = left + (right - left) / 2;
    
            if (isBadVersion(mid)) {
                // If mid is a bad version, move right to mid
                right = mid;
            } else {
                // If mid is not a bad version, move left to mid + 1
                left = mid + 1;
            }
        }
    
        // At this point, left and right converge to the first occurrence of a bad version
        return left;
    }
    
}
