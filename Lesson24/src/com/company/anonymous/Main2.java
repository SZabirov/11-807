package com.company.anonymous;

public class Main2 {
    public static void main(String[] args) {
        String[] lines = {"abc,AaA", "bbb", "ha-HA"};
        TextProcessor textProcessor = new TextProcessor(lines);

        //анонимный класс
        TextProcessingRule rule = new TextProcessingRule() {
            @Override
            public String process(String s) {
                String result = s.toLowerCase();
                return result;
            }
        };


        textProcessor.process(rule);//должен применить rule.process() к каждой строке принятого массива
        textProcessor.show();
    }
}
