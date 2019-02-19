package com.company.anonymous;

public class Main5 {
    public static void main(String[] args) {
        String[] lines = {"abc, Aa A", "b. bb", "h, a- HA"};
        TextProcessor textProcessor = new TextProcessor(lines);

        textProcessor.process(s -> s.replace(" ", ""));
        textProcessor.process(s -> s.replace(",", ""));
        textProcessor.show();
    }
}
