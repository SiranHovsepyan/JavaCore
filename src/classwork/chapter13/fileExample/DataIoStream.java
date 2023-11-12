package classwork.chapter13.fileExample;

import java.io.*;

public class DataIoStream {
    private  static  final String FILE_PATH = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\fileExample\\example.txt";

    public static void main(String[] args) throws IOException {
        write();
        read();

    }
    public static  void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(33);
        out.writeBoolean(false);
        out.writeUTF(" hello");
        out.close();
    }

    public static  void read() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());
        inputStream.close();
    }
}
