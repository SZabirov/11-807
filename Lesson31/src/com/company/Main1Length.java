package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1Length {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcadsf");
        list.add("eruer");
        list.add("qwroi");

        List<Integer> lengths = new ArrayList<>();
        for (String s : list) {
            lengths.add(s.length());
        }

        List<Integer> lengths2 = list.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
    }
}
