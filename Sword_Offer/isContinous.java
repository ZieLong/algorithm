package Sword_Offer;

import java.util.Arrays;

/*
随机抽5张牌判断能否组成顺子，大小王为任意牌，J,Q,K为11，12，13

思路：
1、排序
2、计算所有相邻数字之间间隔总数
3、计算0（癞子）的个数
4、如果2、3相等，就是顺子
5、如果出现对子，就不可能是顺子
 */
public class isContinous {
    public boolean isContinous(int[] numbers) {
        int numOfZero = 0;
        int numOfInterval = 0;
        int length = numbers.length;
        if(length == 0) return false;
        Arrays.sort(numbers);
        for(int i = 0; i < length - 1; i++) {
            if(numbers[i] == 0) {
                numOfZero++;
                continue;
            }
            if(numbers[i] == numbers[i + 1]) {
                return false;
            }
            numOfInterval += numbers[i + 1] -numbers[i] - 1;
        }
        if(numOfZero >= numOfInterval) {
            return true;
        }
        return false;
    }
}
