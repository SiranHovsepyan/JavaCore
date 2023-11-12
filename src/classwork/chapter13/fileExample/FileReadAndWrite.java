package classwork.chapter13.fileExample;

import java.io.*;

import static classwork.chapter13.fileExample.DataIoStream.read;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\fileExample\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();

    }

    private static void write() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH));
        for (int i = 0; i < 1000; i++) {
            bw.write("hallo \n");
            bw.write("hallo from java");
        }

        bw.close();
    }

    private static void read() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_PATH))) {
//            String line = "";
//            int lineNumber = 1;
//            while ((line = bufferedReader.readLine()) != null) {
//                System.out.println(lineNumber++ + " " + line);
//            }


           int c;
           while ((c=bufferedReader.read())!= -1){
               System.out.print((char) c);
           }

        } catch (IOException e) {
           e.printStackTrace();
        }
    }

}
