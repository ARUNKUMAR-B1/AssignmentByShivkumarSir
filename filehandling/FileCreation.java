package filehandling;

import java.io.*;

public class FileCreation {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\Admin\\Desktop\\file2.txt");
//        System.out.println(file.getParent());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.isDirectory());
//        System.out.println(file.isFile());
//        System.out.println(file.exists());
//        System.out.println(file.canExecute());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.delete());
//        try {
//            if (file.createNewFile()) {
//                System.out.println("file is "+file.getName());
//
//            }
//        }catch(IOException e){
//            System.out.println("file already exists" );
//        }
//        System.out.println(file.exists());
//        File filee = new File("C:\\Users\\Admin\\Desktop\\temp.txt");
//        try {
//            System.out.println(filee.createNewFile());
//        } catch (IOException e) {
//
//        }
//        System.out.println(filee.exists());
//        System.out.println(filee.canRead());
        //all are returns the path only
//        System.out.println(filee.getAbsolutePath());
//        System.out.println(filee.getAbsoluteFile());
//        try {
//            System.out.println(filee.getCanonicalPath());
//        } catch (IOException e) {
//
//        }
////        System.out.println(filee.length());
//        try {
//            FileWriter writer = new FileWriter("filee,txt");
//            writer.write("yaro yaro yaro ivanu\n yaro yaro yaro yaro ivanu");
//            wr iter.close();
//            System.out.println(filee.length());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//
//        }

        //reading the file

        File filee=new File("temp.txt");
        System.out.println(filee.exists());
        System.out.println(filee.isFile());
        try{
            FileWriter writer=new FileWriter(filee);
            writer.write("hello buddy");
            writer.close();
        }catch(IOException e){
            throw new RuntimeException(e);
        }
try{
    FileReader fileReader=new FileReader(filee.getAbsoluteFile());
    int character;
    while((character=fileReader.read())!=-1){
        System.out.println((char)character);
    }
}catch(FileNotFoundException fne){
    throw new RuntimeException(fne);
}catch(IOException e){
    throw new RuntimeException(e);
}





    }
}
