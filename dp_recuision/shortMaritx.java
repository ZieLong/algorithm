package dp_recuision;

/**
 *从矩阵左上角走到右下角最短路径
 * 构建一个与源矩阵一样大小的矩阵，用来存最短路径
 */
public class shortMaritx {
    public int minPathSum1(int[][] m) {
        if (m == null || m.length == 0 || m[0] == null || m[0].length == 0) {
            return 0;
        }
        int row = m.length;
        int col = m[0].length;
        int[][] dp = new int[row][col];
        dp[0][0] = m[0][0];
        for(int i = 1; i < row; i++) {
            dp[i][0] = dp[i -1][0] + m[i][0];
        }
        for(int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j -1] + m[0][j];
        }
        for(int i = 1; i < row; i ++) {
            for(int j = 1; j < col; j ++) {
                dp[i][j] = m[i][j] + Math.min(dp[i -1][j],dp[i][j - 1]);
            }
        }
        return dp[row - 1][col -1];
    }
}

