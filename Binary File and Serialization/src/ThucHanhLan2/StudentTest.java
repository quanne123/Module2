package ThucHanhLan2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void writeToFile(String path , List<Student> students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Trần Văn Anh Quân", "Đà Nẵng"));
        students.add(new Student(2,"Ngô Văn Trưởng", "Miếu Bông"));
        students.add(new Student(3,"Nguễn Văn Thể", "Ngô Quyền"));
        students.add(new Student(4,"Ninh Nguyễn Hữu Hoàng", "Hải Hồ"));
        students.add(new Student(5,"Lễ Hữu Tài", "Bến Xe"));
        writeToFile("src/ThucHanhLan2/student.txt",students);
        List<Student> studentDataFromFile = readDataFromFile("src/ThucHanhLan2/student.txt");
        for (Student student : studentDataFromFile){
            System.out.println(student);
        }
    }


    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return students;
    }



}
