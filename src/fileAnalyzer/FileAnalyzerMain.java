package fileAnalyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileAnalyzerMain {
    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer = new FileAnalyzer();
        String path = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\fileAnalyzer\\word.txt";
        System.out.println(fileAnalyzer.wordMap(path));
        System.out.println(fileAnalyzer.totalWordCount(path));
        System.out.println(fileAnalyzer.uniqueWordCount(path));
        System.out.println(fileAnalyzer.topFrequentWords(path,3));
        System.out.println(fileAnalyzer.countWordOccurrences(path,"hello"));

    }

}
