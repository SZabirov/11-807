package com.company.anonymous;

public class Main3 {
    public static void main(String[] args) {
        String[] lines = {"abc,AaA", "b.bb", "h,a-HA"};
        TextProcessor textProcessor = new TextProcessor(lines);

        //пример лямбда выражения
        TextProcessingRule rule = s -> {
            String result = s.replace(",", "");
            result = result.replace(".", "");
            return result;
        };
        textProcessor.process(rule);
        textProcessor.show();
    }
}
