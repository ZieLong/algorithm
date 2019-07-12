package Sword_Offer;

import java.util.Stack;

public class MnStack {
    Stack<Integer> minSatck = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public void push (int node) {
        stack.push(node);
        if(node <= min) {
            minSatck.push(node);
        }
        min = minSatck.peek();
    }
    public void pop() {
        if(minSatck.peek() == stack.peek()) {
            stack.pop();
            minSatck.pop();
        }else {
            stack.pop();
        }
        min = minSatck.peek();
    }
    public int top() {
        return stack.pop();
    }
    public int min() {
        return min;
    }

}
