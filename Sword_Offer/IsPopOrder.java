package Sword_Offer;

import java.util.Stack;

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序
 *
 * 思想：建一个栈，遍历第一个数组的元素，如果和第二个数组的第一个元素不同就入栈，相同就出栈，
 * 同时第二个数组指针后移。如果栈空或者两个数组同时遍历完则true，否则false；
 */
public class IsPopOrder {
    public boolean IsPopOrder(int[] pushA,int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);
            if(pushA[i] == popA[j]) {
                stack.pop();
                j++;
                if(j == popA.length - 1) return true;
            }
        }
        while(!stack.isEmpty()) {
            if(stack.pop() != popA[j++]) {
                return false;
            }
        }
        return true;
    }
}
