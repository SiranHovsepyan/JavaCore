package fileAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FileAnalyzer {

    public Map<String, Integer> wordMap(String path) {
        Map<String, Integer> map = new HashMap<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            while ((line = bufferedReader.readLine()) != null) {
                int value = 1;
                String[] word = line.split(" ");
                for (String string : word) {
                    if (map.containsKey(string)) {
                        map.put(string, map.get(string) + 1);
                    } else {
                        map.put(string, value);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }


    public int totalWordCount(String path) {
        Map<String, Integer> map = wordMap(path);
        int wordCount = 0;
        for (Integer value : map.values()) {
            wordCount += value;
        }
        return wordCount;
    }

    public int uniqueWordCount(String path) {
        Map<String, Integer> map = wordMap(path);
        int uniqueWord = 0;
        for (Integer value : map.values()) {
            if (value == 1) {
                uniqueWord++;
            }
        }
        return uniqueWord;
    }

    public Map<String, Integer> topFrequentWords(String path, int n)  {
        Map<String, Integer> map = wordMap(path);
        Map<String, Integer> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue()>=n){
                newMap.put(stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
            }
        }

        return newMap;
    }

    public int countWordOccurrences(String path, String word)  {
        Map<String, Integer> map = wordMap(path);
        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getKey().equals(word)){
               return stringIntegerEntry.getValue();
            }
        }

        return 0;
    }
}
