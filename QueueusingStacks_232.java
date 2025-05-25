package LEETCODE;

import java.util.Stack;

public class QueueusingStacks_232{
    private Stack <Integer> stack1;
    private Stack <Integer> stack2;
    public QueueusingStacks_232(){
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void push(int x) {
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return stack2.peek(); 
    }
    
    public boolean empty() {
        return stack2.isEmpty() && stack1.isEmpty();
    }

    public static void main(String[] args) {
        QueueusingStacks_232 stack = new QueueusingStacks_232();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.push(7);
        System.out.println(stack.peek());

    }
}