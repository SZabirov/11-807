package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main3StreamFilter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcadsf");
        list.add("eruer");
        list.add("qwroi");

        Predicate<String> p = s -> s.charAt(0) == 'a' ||
                s.charAt(0) == 'A';
        List<String> list1 = list.stream()
                .filter(p)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
