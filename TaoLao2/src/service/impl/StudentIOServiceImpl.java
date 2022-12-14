package service.impl;

import model.Student;
import service.IStudentIOService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentIOServiceImpl implements IStudentIOService {
    @Override
    public List<Student> readFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        List<Student> studentList = new ArrayList<>();
        while((line = bufferedReader.readLine())!= null){
            String[] std = line.split(",");
            Student student = new Student(Integer.parseInt(std[0]),std[1],Integer.parseInt(std[2]),std[3],std[4]);
            studentList.add(student);
        }
        bufferedReader.close();
        fileReader.close();
        return studentList;
    }

    @Override
    public void writeFile(String path, List<Student> studentList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Student student : studentList){
            bufferedWriter.write(student.formatCSVStudent());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
