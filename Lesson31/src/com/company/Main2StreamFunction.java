package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main2StreamFunction {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("abcadsf");
        list.add("eruer");
        list.add("qwroi");

        Stream<String> stream = list.stream();
        Function<String, Integer> f = s -> s.length();
        Stream<Integer> newStream = stream.map(f);
        List<Integer> integerList = newStream
                .collect(Collectors.toList());
    }
}
