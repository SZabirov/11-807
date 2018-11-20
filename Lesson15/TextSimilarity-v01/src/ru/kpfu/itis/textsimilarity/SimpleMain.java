package ru.kpfu.itis.textsimilarity;

import java.util.Scanner;

public class SimpleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите путь до папки:");
        String folderPath = sc.nextLine();
        System.out.println("Введит запрос:");
        String query = sc.nextLine();
        SearchEntryPoint sep = new SearchEntryPoint();
        sep.searchForTextInFolder(query, folderPath);
    }
}
