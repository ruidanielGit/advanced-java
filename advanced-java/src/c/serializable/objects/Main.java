package c.serializable.objects;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("John", 20, 10);

        String filename = "D:\\ADVANCED JAVA.Test.txt";
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        //Serialization
        try {
            fileOutputStream = new FileOutputStream(filename);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Object has been serialized:" + student);
        } catch (IOException e) {
            System.out.println("IOException is caught");
        }

        //Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        try {
            fileIn = new FileInputStream(filename);
            objectIn = new ObjectInputStream(fileIn);

            Student object = (Student) objectIn.readObject();

            System.out.println("Object has been deserialized:" + object);
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("IOException is caught");
        }
    }
}
