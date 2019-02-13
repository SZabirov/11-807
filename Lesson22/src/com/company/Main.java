package com.company;

import com.company.simplemap.Map;
import com.company.simplemap.SimpleMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new SimpleMap<>();
        map.put("Каренин", 10);
        map.put("дом", 16);
        System.out.println(map.get("дом"));
    }
}
