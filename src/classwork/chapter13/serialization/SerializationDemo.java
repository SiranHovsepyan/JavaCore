package classwork.chapter13.serialization;

import java.io.*;

public class SerializationDemo {
    public static final String FILE_PATH ="C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\serialization\\file\\example.txt";

    public static void main(String[] args) throws IOException,ClassNotFoundException{
//        Student student =new Student("poxos","poxosyan",39,"sss");
//
//        try(ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(FILE_PATH))){
//            objectOutputStream.writeObject(student);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        student.setAge(55);


        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object object = objectInputStream.readObject();
            if (object instanceof Student) {
                Student student = (Student) object;
                System.out.println(student);
            }

        }
    }
}
