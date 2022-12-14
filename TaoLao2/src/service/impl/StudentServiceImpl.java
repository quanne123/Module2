package service.impl;

import model.Student;
import service.IStudentIOService;
import service.IStudentService;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private final String STUDENT_PATH_NAME = "src/data/student.csv";
    private final IStudentIOService iStudentIOService = new StudentIOServiceImpl();

    @Override
    public void addStudent(Student student) throws IOException {
        List<Student> studentList = this.iStudentIOService.readFile(STUDENT_PATH_NAME);
        for (Student student1 : studentList) {
            if (student1.getId() == student.getId()) {
                System.out.println("id invalid");
                break;
            }
        }
        studentList.add(student);
        this.iStudentIOService.writeFile(STUDENT_PATH_NAME, studentList);
    }


    @Override
    public List<Student> getStudent() throws IOException {
        return this.iStudentIOService.readFile(STUDENT_PATH_NAME);
    }

    @Override
    public void deleteStudent(int id) throws IOException {
        List<Student> studentList = this.iStudentIOService.readFile(STUDENT_PATH_NAME);
        Student deleteid = null;
        for (Student student : studentList) {
            if (student.getId() == id) {
                deleteid = student;
            }
        }
        if (deleteid == null) {
            System.out.println("Error");
        } else {
            studentList.remove(deleteid);
        }
        this.iStudentIOService.writeFile(STUDENT_PATH_NAME, studentList);
    }

    @Override
    public void searchStudent(String name) throws IOException {
        List<Student> studentList = this.iStudentIOService.readFile(STUDENT_PATH_NAME);
        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }
}
