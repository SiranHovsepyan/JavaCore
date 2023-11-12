package homework10.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//fileSearch();
//        contentSearch();
//        findLines();
//        printSizeOfPackage();
        createFileWithContent();
    }

    static void fileSearch() {
        System.out.println("Please input file path for search");
        String path = scanner.nextLine();
        System.out.println("Please input file name for search");
        String fileName = scanner.nextLine();
        File file = new File(path, fileName);
        if (file.exists()) {
            System.out.println(file);
        }

    }

    static void contentSearch() {
        System.out.println("Please input file path for search");
        String path = scanner.nextLine();
        System.out.println("Please input any keyword");
        String keyword = scanner.nextLine();
        File file = new File(path);
        File[] list = file.listFiles();
        for (File file1 : list) {
            if (file1.isFile() && file1.getName().contains(".txt") && file1.getName().contains(keyword)) {
                System.out.println(file1);
            }
        }

    }

    static void findLines() {
        System.out.println("Please input txt file path for search");
        String txtPath = scanner.nextLine();
        System.out.println("Please input any keyword");
        String keyword = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            int lineNumber = 1;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println(lineNumber + " " + line);
                }
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void printSizeOfPackage() {
        System.out.println("Please input file path for search");
        String path = scanner.nextLine();
        File file = new File(path);
        File[] list = file.listFiles();
        long size = 0;
        for (File file1 : list) {
            size = size + file1.length();
        }
        System.out.println(size);
    }

    static void createFileWithContent() {
        System.out.println("Please input file path for search");
        String path = scanner.nextLine();
        System.out.println("Please input file name for search");
        String fileName = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();
        File file = new File(path, fileName);
       try(FileWriter fileWriter = new FileWriter(file)){
           fileWriter.write(content);
       }catch (IOException e){
           e.printStackTrace();
       }
    }
}




