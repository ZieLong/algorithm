package kuaishou;

/**
 * 最长升序子序列
 */
public class LongestIncreaceSubStr {
    /*
    O(n^2)的方法
    长度为N的dp[]数组，dp[i]表示以i结尾的最长升序长度
     */
    public int[] getdp1(int[] arr) {
        int[] dp = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        return dp;
    }
    /*
    O(nlog(n))的算法
    使用一个辅助数组ends维持最长子序列为x的最小结尾数，利用二分查找ends数组降低复杂度
     */
//    public static  int[] getdp2(int[] arr) {
//        int[] dp = new int[arr.length];
//        int[] ends = new int[arr.length];
//        ends[0] = arr[0];
//        dp[0] = 1;
//        int right = 0;
//        //二分元素
//        int l = 0;
//        int r = 0;
//        int m  = 0;
//        for(int i = 1; i < arr.length; i++) {
//            l = 0;
//            r = right;
//            while(l <= r) {
//                m = (l + r) /2;
//                if(arr[i] > ends[m]) {
//                    l = m + 1;
//                }else {
//                    r = m - 1;
//                }
//            }
//            right = Math.max(right,l);
//            ends[l] = arr[i];
//            dp[i] = l + 1;
//        }
//        return dp;
//    }
    public static int[] getdp2(int[] arr) {
        int[] dp = new int[arr.length];
        int[] ends = new int[arr.length];
        ends[0] = arr[0];
        dp[0] = 1;
        int right = 0;
        int l = 0;
        int r = 0;
        int m = 0;
        for(int i = 1; i < arr.length; i++) {
            l = 0;
            r = right;
            while(l <= r) {
                m = (l + r) / 2;
                if(arr[i] > ends[l]) {
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }
            right = Math.max(l,right); //判断ends数组是否需要加长
            ends[l] = arr[i];
            dp[i] = l + 1;
        }
        return dp;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,6,4,8,9,7};
        int[] dp = getdp2(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(dp[i]);
        }
    }
}
