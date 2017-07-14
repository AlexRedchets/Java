package com.company;

import java.util.Objects;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "heleh";
        //System.out.println(isPalendrom(str));
        System.out.println(isBalanced("s{}dgsg"));
    }

    public static String reverseString(String str){
        String[] arr = str.split("");
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            temp.append(arr[arr.length - 1 - i]);
        }
        return temp.toString();
    }

    public static boolean isPalendrom(String str){
        String temp = reverseString(str);
        return Objects.equals(temp, str);
    }

    public static boolean isBalanced(String str){
        char[] arr = str.toCharArray();
        System.out.println(arr[2]);
        Stack<Character> stack = new Stack<>();
        for (char anArr : arr) {
            switch (anArr){
                case '(':
                case '[':
                case '{':
                    System.out.println("Got it");
                    stack.push(anArr);
                case ')':
                    if (stack.empty() || stack.pop() != ')'){
                        return false;
                    }
                case ']':
                    if (stack.empty() || stack.pop() != ']'){
                        return false;
                    }
                case '}':
                    if (stack.empty() || stack.pop() != '}'){
                        return false;
                    }
                    System.out.println("Got it");
            }
            return !stack.empty();
        }
        return true;
    }
}
