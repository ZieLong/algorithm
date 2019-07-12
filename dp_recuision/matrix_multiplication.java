package dp_recuision;

/**
 * 矩阵乘法解决斐波拉契
 * 真是精妙啊
 */
public class matrix_multiplication {
    public int[][] matrixPower(int[][] m, int p) {
        int[][] res = new int[m.length][m[0].length];
        for (int i = 0; i < res.length; i++) {
            res[i][i] = 1;
        }
        int[][] tmp = m;
        for(; p != 0; p >>= 1) {
            if((p & 1) != 0) {
                res = mulimatrix(res,tmp);
            }
            tmp = mulimatrix(tmp,tmp);
        }
        return res;
    }

    public int[][] mulimatrix(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][m2[0].length];
        for(int i = 0; i < m2[0].length; i++) {
            for(int j = 0; j < m1.length; j++) {
                for(int k = 0; k < m2.length; k++) {
                    res[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return res;
    }

    public int f3(int n) {
        if(n < 1) {
            return 0;
        }
        if(n == 1 || n == 2) {
            return 1;
        }
        int[][] base = {{1,1},{1,0}};
        int[][] res = matrixPower(base,n-2);
        return res[0][0] + res[1][0];
    }
    public static void main(String[] args) {

    }
}
