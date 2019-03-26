package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main05Final {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcadsf");
        list.add("eruer");
        list.add("qwroi");

        list.stream()
                .filter(s -> s.charAt(0) == 'a')
                .map(s -> s.length())
                .forEach(i -> System.out.println(i));

        list.stream()
                .sorted(((o1, o2) -> o1.length() - o2.length()))
                .forEach(s -> System.out.println(s));
    }
}
