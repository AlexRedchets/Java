package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String str = "heleh";
        System.out.println(isPalendrom(str));
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
}
