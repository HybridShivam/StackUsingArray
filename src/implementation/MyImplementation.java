/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 31-Jan-20
 *  Time: 1:49 PM
 */
package implementation;

import stack.MyStack;

import java.beans.ParameterDescriptor;
import java.util.Random;

public class MyImplementation {
    public static void main(String[] args) {
        int maxSizeOfStack = 10;
        MyStack  stack = new MyStack(maxSizeOfStack);
        int element = stack.peek();//Causing UnderFlow
        element = stack.pop();//Causing UnderFlow

        boolean check = stack.isEmpty();

        System.out.println("size of stack =" + stack.size());

        stack.push(200);
        System.out.println("size of stack =" + stack.size());
        for (int i = 0; i < 9 ; i++) {
            stack.push(new Random().nextInt(100));
        }
        System.out.println("size of stack =" + stack.size());


        for (int i = 0; i <maxSizeOfStack; i++) {
            System.out.println(stack.pop());
        }
    }
}
