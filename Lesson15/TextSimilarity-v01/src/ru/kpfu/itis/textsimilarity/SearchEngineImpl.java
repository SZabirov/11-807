package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SearchEngineImpl implements SearchEngine {
//    Logger logger = new Logger();
    BetterLogger logger = BetterLogger.getInstance();
    private TextAnalyzer analyzer;

    public SearchEngineImpl(TextAnalyzer analyzer) {
        this.analyzer = analyzer;
    }

    @Override
    public List<TextProvider> getSortedByRelevanceList(TextProvider target, List<TextProvider> sources) {
        List<TextProvider> results = new ArrayList<>(sources);
        //не обращайте внимания, плохая (некорректная) реализация с помощью лямбда-выражений
        results.sort(Comparator.comparing(o -> analyzer.analyze(o, target)));
        logger.info("Провайдеры отсортированы");
        return results;
    }
}
