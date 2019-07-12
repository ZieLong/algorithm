package Sword_Offer;

/**
 * 判断一个序列是否是二叉排序树的后序遍历
 *递归的判断序列是否符合
 */
public class VerifySquenceofBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if(sequence.length == 0) {
            return false;
        }
        return judge(sequence,0,sequence.length - 1);

    }
    public boolean judge(int[] a,int start,int last) {
        if(start >= last) {
            return true;
        }
        int i = last;
        while(i > start && a[i - 1] > a[last]) {
            --i;
        }
        for(int j = i - 1; j >= start; --j) {
            if(a[j] > a[last]) {
                return false;
            }
        }
        return judge(a,start,i - 1) && judge(a,i,last - 1);
    }
}
