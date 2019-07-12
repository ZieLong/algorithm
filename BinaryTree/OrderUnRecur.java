package BinaryTree;

import java.util.Stack;

/**
 * 非递归的对二叉树进行排序
 */
public class OrderUnRecur {
    public void preOrderUnRecur(Node head) {
        System.out.println("pre-order:");
        if(head != null) {
            Stack<Node>  stack = new Stack<>();
            stack.add(head);
            while(!stack.isEmpty()) {
                head = stack.pop();
                System.out.println("->" + head.value); //遍历
                if(head.right != null) {
                    stack.push(head.right);
                }
                if(head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    public void inOrderUnRecur(Node head) {
        System.out.println("in-order:");
        if(head != null) {
            Stack<Node> stack = new Stack<>();
            while(!stack.isEmpty() || head != null) {
                if(head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.println("->" + head.value);
                    head = head.right;
                }
            }
        }
    }

    /*
    后续遍历
     */

    public void posOrderUnRecur1(Node head) {
        System.out.println("pos-order: ");
        if(head != null) {
            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            stack1.push(head);
            while(!stack1.isEmpty()) {
                head = stack1.pop();
                stack2.push(head);
                if(head.left != null) {
                    stack1.push(head.left);
                }
                if(head.right != null) {
                    stack1.push(head.right);
                }
            }
            while(!stack2.isEmpty()) {
                System.out.println(stack2.pop() + "->");
            }
        }
    }


    /*
    只使用一个栈的后续遍历
     */
    public void posOrderUnRecur2(Node h) {
        System.out.println("pos-order: ");
        if(h != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(h);
            Node c = null;
            while(!stack.isEmpty()) {
                c = stack.peek();
                if(c.left != null && h != c.left && h != c.right) {
                    stack.push(c.left);
                } else if(c.right != null && h != c.right) {
                    stack.push(c.right);
                } else {
                    System.out.println(stack.pop().value + "->");
                    h = c;
                }
            }
        }
    }

}
