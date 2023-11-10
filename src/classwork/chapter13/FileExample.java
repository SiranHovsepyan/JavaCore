package classwork.chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {
    public static void main(String[] args) {

//        String directoryPath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\out\\production\\JavaCore\\classwork\\chapter13";
//        String fileName = "FileExample.java";
//        String filePath = directoryPath + File.separator + fileName;
//        File file = new File(filePath);
//        System.out.println(file.exists());


//        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\test";
//        File file = new File(filePath);
//        if (file.isDirectory()) {
////            String[] list = file.list();
////            for (String name : list) {
////                System.out.println(name);
////            }
//
//            File[] list = file.listFiles();
//            for (File f : list) {
//                if (f.isFile()) {
//                    System.out.println(f.getName() + " " + f.length() + " " + new Date(f.lastModified()) + " " + f.canWrite());
//                }
//
//            }
//        }

//        System.out.println(file.exists());
//        System.out.println(file.isDirectory());


//        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\test\\asdf.txt";
//        File file = new File(filePath);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//                System.out.println("file created");
//            } catch (IOException e) {
//                System.out.println("can not create file" + e);
//            }
//        } else {
//            System.out.println("file not created");
//        }


        //for delete file
//        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\test\\asdf.txt";
//        File file = new File(filePath);
//        if (file.exists()){
//            if (file.delete()) {
//                System.out.println("file deleted");
//            }
//        }
//        System.out.println(file.getTotalSpace()+file.getFreeSpace());

// create in folder1 new folder 12345
        String filePath = "C:\\Users\\Admin\\IdeaProjects\\JavaCore\\src\\classwork\\chapter13\\test\\folder1";
        File file = new File(filePath + File.separator + "123456");
        if (!file.exists()) {
            System.out.println(file.mkdir());
        }


    }
}
