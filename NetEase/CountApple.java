package NetEase;

import java.util.Scanner;

/**
 *又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
 牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
 在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
 牛牛觉得这个问题太简单，所以希望你来替他回答。
 */
public class CountApple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] map = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int tmp = scanner.nextInt();
            a[i] = tmp;
            sum += a[i];
            map[i] = sum;
        }
        int m = scanner.nextInt();
        int[] mList = new int[m];
        int[] ans = new int[m];
        for(int i = 0; i < m; i++) {
            System.out.println(binarySearch(scanner.nextInt(),map));
        }
    }
    public static int binarySearch(int m, int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = nums.length / 2;
        int ans = -1;
        while(left != right - 1){
            if(nums[mid] == m) {
                ans = mid;
                break;
            }else if(m > nums[mid]) {
                left = mid;
                mid = (left + right) / 2;
            }else if(nums[mid] > m) {
                right = mid;
                mid = (left + right) / 2;
            }
        }
        if(left == right - 1){
            if(m > nums[left]) {
                ans = right;
            }else {
                ans = left;
            }
        }
        return ans;
    }


}
