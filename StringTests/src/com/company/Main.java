package com.company;

import java.util.Objects;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = "heleh";
        //System.out.println(isPalendrom(str));
        //System.out.print(isBalanced("s{([])}dgsg"));
        System.out.print(sqrt(45));
    }

    public static double sqrt(double num){
        double i;
        double sqrt = num*0.5;
        do {
            i = sqrt;
            sqrt = (i + (num/i))*0.5;
        } while ((i - sqrt) != 0);
        return sqrt;
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
        String[] arr = str.split("");
        Stack<String> stack = new Stack<>();
        for (String anArr : arr) {
            switch (anArr) {
                case "{":
                case "(":
                case "[":
                    stack.push(anArr);
                    break;
                case "}":
                    if (stack.empty() || !(stack.pop()).equals("{")){
                        return false;
                    }
                    break;
                case ")":
                    if (stack.empty() || !(stack.pop()).equals("(")){
                        return false;
                    }
                    break;
                case "]":
                    if (stack.empty() || !(stack.pop()).equals("[")){
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
