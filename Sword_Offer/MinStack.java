package Sword_Offer;

import java.util.Arrays;
import java.util.Stack;

/**
 * O(1)时间复杂度得到栈里最小元素
 * 只是需要O（1）时间内得到最小元素，两个栈，两个数组，栈+数组都可以。
 * 关键是如何在O(1)复杂度内得到容器类的指定元素。
 */
public class MinStack {
    private int size;
    private int  min = Integer.MAX_VALUE;
    private Stack<Integer> minStack = new Stack<>();
    private Integer[] element = new Integer[10];

    public void push(int node) {
        element[size++] = node;
        if(node <= min) {
            minStack.push(node);
            min = minStack.peek();
        } else {
            minStack.push(min);
        }
    }

    private void ensureCapacity(int size) {
        int len = element.length;
        if(size > len) {
            int newLen = (len * 3) / 2 + 1;
            element = Arrays.copyOf(element,newLen);
        }
    }
    public void pop(){
        Integer top = top();
        if(top != null) {
            element[size - 1] = null;
        }
        size--;
        minStack.pop();
        min = minStack.peek();
    }
    public int top() {
        if(!empty()) {
            if(size - 1 > 0) {
                return element[size - 1];
            }
        }
        return (Integer) null;
    }
    public boolean empty(){
        return size == 0;
    }
}
