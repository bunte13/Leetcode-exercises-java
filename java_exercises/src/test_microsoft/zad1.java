/* There are N balls positioned in a row. Each of them is either red or white. In one move we can swap two adjacent balls. We want to arrange all the red balls into a consistent segment. What is the minimum number of swaps needed?
Write a function:
class Solution ( public int solution(String S) : }
that, given string S of length N built from characters "R" and "W", representing red and white ball respectively, returns the minimum number of swaps needed to arrange all the red balls into a consistent segment. If the result exceeds 10°
, return -1.
Examples:
1. Given S = WRRWWR"
your tunction should return 2. We can move the last ball two positions t
the left:
• "WRRWRW"
• "WRRRWW"
2. Given S = "WWRWWWRWR", your function should return 4. We can move first and last red ball
Towards the middle one:
• "WWWWWRWR"
• "WWWWRWRWR"
• "WWWWWRRWR"
• "WWWWWRRRW"
3. Given S = "WwW", your function should return 0. There are no red balls to arrange into a
segment.
4. Given S is "RW" repeated 100,000 times, your function should return -1. The minimum needed number of swaps is greater than 10°,*/



public class zad1 {
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"RWRWWRW", "RRRRR", "WWWWW", "RWWRRRW", "WRRWWR"};

        // Iterate through test cases
        for (String testCase : testCases) {
            int result = solution(testCase); // Call the solution method

            // Print the test case and the result
            System.out.println("Test Case: " + testCase);
            System.out.println("Minimum swaps needed: " + result);
            System.out.println();
        }
    }

    public static int solution(String S) {
        int kolku = 0; 
        int swaps = 0;
        for (char znak : S.toCharArray()) {
            if (znak == 'R') {
                kolku++;
            }
        }
        int prvo = S.indexOf('R');
        int posledno = S.lastIndexOf('R');
        if (prvo != -1 && posledno != -1) {
            swaps = posledno - prvo - (kolku - 1);
        }
        if (swaps > 1000000000) {
            return -1;
        }

        return swaps;
    }

    
}
