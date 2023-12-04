package classwork.analyzer;

import java.util.Map;

public class FileAnalyzeMain {
    public static void main(String[] args) {
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\example\\mytext.txt";
        Map<String, Integer> stringIntegerMap = FileAnalyze.wordMap(path);
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "->" + stringIntegerEntry.getValue());
        }
        System.out.println("totalWordCount" + FileAnalyze.totalWordCount(path));
        System.out.println("uniquewordcount" + FileAnalyze.uniqueWordCount(path));

        Map<String, Integer> stringIntegerMap1 = FileAnalyze.topFrequentWords(path, 5);
        System.out.println("topFrequentWords");
        for (Map.Entry<String, Integer> stringIntegerEntry : stringIntegerMap1.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + "->" + stringIntegerEntry.getValue());
        }

        System.out.println(FileAnalyze.countWordOccurrences(path,"sed"));

    }
}
