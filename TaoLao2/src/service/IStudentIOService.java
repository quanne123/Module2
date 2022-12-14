package service;

import model.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IStudentIOService {
    List<Student> readFile(String path) throws IOException;

    void writeFile(String path,List<Student> studentList) throws IOException;
}
