/* You are given a matrix A representing a chessboard with N rows and M columns.
 Each square of the chessboard contains an integer representing a points-based score.
  You have to place two rooks on the chessboard in such a way that they cannot attack
   each other and the sum of points on their squares is maximal. Rooks in chess can 
   attack each other only if they are in the same row or column.*/


public class zad2 {
    public static void main(String[] args) {
        // Test cases
        int[][][] testCases = {
            // Test case 1
            {
                {1, 4},
                {2, 3}
            },
            // Test case 2
            {
                {15, 1, 5},
                {16, 3, 8},
                {2, 6, 4}
            },
            
        };

       
        for (int i = 0; i < testCases.length; i++) {
            int[][] chessboard = testCases[i];
            int maxScore = maxRookScore(chessboard);
            System.out.println("Test Case " + (i + 1) + ": Maximum Rook Score = " + maxScore);
        }
    }

    public static int maxRookScore(int[][] A) {
        int rowlen = A.length; // broj redici
        int collen = A[0].length; // broj koloni

        int maxwin = 0;

       
        for (int a = 0; a < rowlen; a++) {
            for (int b = 0; b < collen; b++) {
                for (int a1 = 0; a1 < rowlen; a1++) {
                    for (int b1 = 0; b1 < collen; b1++) {
                        if (a != a1 && b != b1) {
                            int score = A[a][b] + A[a1][b1];
                            maxwin = Math.max(maxwin, score); //anita maxwynn
                        }
                    }
                }
            }
        }

        return maxwin;
    }
}
