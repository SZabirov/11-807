package com.company.lambda_repeat;

public class StringProcessor {
    String[] strings;

    void process(MyFunction f) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = f.process(strings[i]);
        }
    }
}
