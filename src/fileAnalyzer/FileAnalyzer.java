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


    public int totalWordCount(String path) throws IOException {

        return 0;
    }

    public int uniqueWordCount(String path) throws IOException {
        return 0;
    }

    public Map<String, Integer> topFrequentWords(String path, int n) throws IOException {
        return null;
    }

    public int countWordOccurrences(String path, String word) throws IOException {
        return 0;
    }
}
