package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by pshivra on 6/3/2018.
 */
public class BalancedBracketsStack {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.next();

            boolean answer = isBalanced(expression);
            if(answer)
            {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scanner.close();
    }

    private static boolean isBalanced(String expression) {
        char[] expressionArray = expression.toCharArray();
        Stack<Character> stackArray = new Stack<>();

        for (int i=0 ; i<expressionArray.length;i++)
        {
            if(expressionArray[i] == '(' || expressionArray[i] == '{' || expressionArray[i] == '['){
                stackArray.push(expressionArray[i]);
            }else{
                if(stackArray.empty())
                {
                    return false;
                }
                char c = stackArray.pop();
                if( (expressionArray[i] == ')' && c!='(') || (expressionArray[i] == ']' && c!='[') || (expressionArray[i] == '}' && c!='{')){
                    return false;
                }
            }
        }

        if(stackArray.empty()){
            return true;
        }else{
            return false;
        }
    }


}
