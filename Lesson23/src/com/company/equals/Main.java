package com.company.equals;

import com.company.equals.simplemap.Map;
import com.company.equals.simplemap.SimpleMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneNumber phoneNumber1 = new PhoneNumber("23", "223322");
        Map<PhoneNumber, String> map = new SimpleMap<>();
        map.put(phoneNumber1, "John");
        map.put(new PhoneNumber("34", "44444444"), "Салават");

        Scanner sc = new Scanner(System.in);
        System.out.println("введите код:");
        String code = sc.next();
        System.out.println("введите номер:");
        String number = sc.next();
        PhoneNumber phoneNumberToFind =
                new PhoneNumber(code, number);
        String name = map.get(phoneNumberToFind);
        System.out.println(name);
    }
}
