package CMBC;

import java.util.Scanner;

public class StarNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] data = new int[1001][1001];
        for(int i=0;i<n;i++){
            data[in.nextInt()][in.nextInt()] = 1;
        }
        //累加data，data[i][j]表示(i,j)和(1,1)构成的矩形阵列中的星星总数
        for(int i=1;i<data.length;i++){
            for(int j=1;j<data.length;j++){
                data[i][j]+=data[i][j-1]+data[i-1][j]-data[i-1][j-1];
            }
        }

        int m = in.nextInt();
        for(int i=0;i<m;i++){
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            int a2 = in.nextInt();
            int b2 = in.nextInt();
            //分割出来所需的矩形阵列
            int sum=data[a2][b2]-data[a2][b1-1]-data[a1-1][b2]+data[a1-1][b1-1];
            System.out.println(sum);
        }

        in.close();

    }
}
