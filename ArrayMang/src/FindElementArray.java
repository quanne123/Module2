import java.util.Scanner;

public class FindElementArray {
    public static void main(String[] args) {
       // khai báo mảng chứa danh sách sinh viên
       String[] students = {"Tài","Thông","Hoàng","Quân","Vũ","Tiến"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name's student:");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (String student : students) {
            if (student.equals(input_name)) {
                System.out.println("Position of the studets in the list" + input_name + "is:" + student);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found" + input_name + " in the list");
        }
    }
}
