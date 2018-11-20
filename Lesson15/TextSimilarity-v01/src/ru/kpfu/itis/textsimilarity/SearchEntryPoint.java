package ru.kpfu.itis.textsimilarity;

public class SearchEntryPoint {
    void searchForTextInFolder(String query, String folderPath) {
        TextProvider provider = new SimpleTextProvider(query);
        SearchEngine se = new SearchEngineImpl(new JaccardTextAnalyzer());
        //...
    }
}
