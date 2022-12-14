package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class StudentController {
    private  final IStudentService studentService = new StudentServiceImpl();

    public void add(Student student){
        try {
            studentService.addStudent(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Student> displayStudent(){
        try {
            return this.studentService.getStudent();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(int id){
        try {
            studentService.deleteStudent(id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void search(String name){
        try {
            studentService.searchStudent(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
