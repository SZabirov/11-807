package com.company;

public class ChangeRegister {
    public static void main(String[] args) {
        char c = 'p';
        if (c >= 'A' & c <= 'Z') {
            char upperC = (char) (c + 32);
            System.out.println(upperC);
        } else {
            if (c >= 'a' & c <= 'z') {
                char downC = (char) (c - 32);
                System.out.println(downC);
            }
        }
    }
}
