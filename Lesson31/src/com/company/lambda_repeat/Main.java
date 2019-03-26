package com.company.lambda_repeat;

public class Main {
    public static void main(String[] args) {
        MyFunction f = s -> s.toLowerCase();
        StringProcessor sp = new StringProcessor();
        sp.process(f);
    }
}
