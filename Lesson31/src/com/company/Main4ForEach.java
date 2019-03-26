package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main4ForEach {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcadsf");
        list.add("eruer");
        list.add("qwroi");

        list.stream()
                .forEach(s -> System.out.println(s));
    }
}
