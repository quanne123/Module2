package ThucHanh;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME = "src/ThucHanh/SaocungDuoc.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {
        Student student1 = new Student("Quan",2,"Da Nang");
        Student student2 = new Student("Truong",1,"Da Nang");
        Student student3 = new Student("Hoang",5,"Da Nang");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        String line = null;
        for (Student student: studentList){
            line = student.getName()+COMMA+student.getId()+COMMA+student.getClassname();
            FileUtils.writeFile(FILE_NAME,line);
            FileUtils.readFile(FILE_NAME);
        }
    }
}
