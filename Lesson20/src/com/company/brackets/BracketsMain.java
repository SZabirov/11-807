package com.company.brackets;

import java.util.Scanner;

public class BracketsMain {
    public static void main(String[] args) {
        //пример: {(2+5)*[(2+3)*4]+1}/7
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean correct = bracketsAreCorrect(s);
    }

    /**
     * Возвращает true, если скобки в выражении расставлены корректно.
     */
    public static boolean bracketsAreCorrect(String s) {
        Stack stack = new Stack(10);
        char[] symbols = s.toCharArray();
        for (int i = 0; i < symbols.length; i++) {
            char c = symbols[i];
            if (c == '(' || c == '{' || c =='['){
                stack.push(c);
            }

        }
        return false;
    }
}
