package ThucHanh3.model;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME = "src/ThucHanh3/data/Student.csv";

    public static void main(String[] args) {
        Student student1 = new Student(1,"Trần Văn Anh Quân",21);
        Student student2 = new Student(2,"Ngô Văn Trưởng",21);
        Student student3 = new Student(3,"Ninh Nguyễn Hữu Hoàng ",26);
        Student student4 = new Student(4,"Đinh Minh Báo",21);

        List<Student> students  = new ArrayList<>();
    }
}
