package iqy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 添加最少括号
 */
public class TheLest {
    public static Stack<Character> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        stack = new Stack<>();
        int n = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }else if(str.charAt(i) == ')') {
                if(stack.isEmpty()) {
                    n++;
                }else {
                    stack.pop();
                }
            }
        }
        int res = n + stack.size();
        System.out.println(res);
    }
}
