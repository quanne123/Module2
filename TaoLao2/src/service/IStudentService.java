package service;

import model.Student;

import java.io.IOException;
import java.util.List;

public interface IStudentService {

    void addStudent(Student student) throws IOException;

    List<Student> getStudent() throws IOException;

    void deleteStudent(int id) throws IOException;

    void searchStudent(String name) throws IOException;

}
