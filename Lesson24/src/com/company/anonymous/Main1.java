package com.company.anonymous;

public class Main1 {
    public static void main(String[] args) {
        String[] lines = {"abc,AaA", "bbb", "ha-HA"};
        TextProcessor textProcessor = new TextProcessor(lines);
        TextProcessingRule rule = new ToUpperCaseTextProcessingRule();
        textProcessor.process(rule);//должен применить rule.process() к каждой строке принятого массива
        textProcessor.show();
    }
}
