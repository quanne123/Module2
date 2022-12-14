package view;

import controller.StudentController;
import model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final Scanner sc = new Scanner(System.in);
    private final StudentController studentController = new StudentController();

    public void displayStudentMenu(){
        do {
            System.out.println("1: Add new Student");
            System.out.println("2: Display Student");
            System.out.println("3: Delete Student");
            System.out.println("4: Search Student by name");
            System.out.println("Enter your Option");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter id Student");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter name ");
                    String name = sc.nextLine();

                    System.out.println("Enter age");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.println("Enter phone number");
                    String phone = sc.nextLine();

                    System.out.println("Enter address");
                    String address = sc.nextLine();

                    this.studentController.add(new Student(id,name,age,phone,address));
                    break;

                case 2:
                    List<Student> studentList = this.studentController.displayStudent();
                    for (Student student : studentList){
                        System.out.println(student);
                    }
                    break;

                case 3:
                    System.out.println("Enter id you want to delete");
                    int deleteId = Integer.parseInt(sc.nextLine());
                    this.studentController.delete(deleteId);
                    break;

                case 4:
                    System.out.println("Enter Name you want to find");
                    String newName = sc.nextLine();
                    this.studentController.search(newName);
                    break;

            }
        }while (true);
    }
}
