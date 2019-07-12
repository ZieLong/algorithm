package kuaishou;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 给满出二叉树，编写算法将其转化为求和树,求和树即根节点的值为所有子节点的和
 */
public class SumTree {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] preList = bufferedReader.readLine().split(" ");
        String[] InList = bufferedReader.readLine().split(" ");
        int length = preList.length;
        if(length == 0) return;
        int[] prearr = new int[length];
        int[] inarr = new int[length];
        int[] inSumArr = new int[length];
        for(int i = 0; i < length; i++) {
            prearr[i] = Integer.parseInt(preList[i]);
            inarr[i] = Integer.parseInt(InList[i]);
        }
        robot(inSumArr, prearr, 0, inarr, 0, length);
        for(int i : inSumArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
   public static void robot(int[] inSumArr, int[] prearr, int preStart, int[] inarr, int inStart, int len) {
       if(len == 0) return;
       int root = prearr[preStart];
       int index = -1;
       for(int i = inStart; i< inStart + len; i++) {
           if(root == inarr[i]) {
               index = i;
               break;
           }
       }
       int leftLen = index - inStart;
       for(int i = inStart; i < inStart +len; i++) {
           if(i != index) inSumArr[index] += inarr[i];
       }
       robot(inSumArr, prearr, preStart + 1, inarr, inStart, leftLen);
       robot(inSumArr, prearr, preStart + leftLen + 1, inarr, index + 1, len - leftLen - 1);
    }

}
