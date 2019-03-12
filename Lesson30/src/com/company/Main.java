package com.company;

public class Main {
    public static void main(String[] args) {
//        User.Builder b = new User.Builder();
//        b.id(1L).firstname("Salavat").secondname("Zabirov");
//        User u = new User(b);

        User u = User.builder()
                .id(1L)
                .firstname("Salavat")
                .secondname("Zabirov")
                .phoneNumber("3222233322")
                .build();

    }
}
