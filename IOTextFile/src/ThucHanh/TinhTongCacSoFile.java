package ThucHanh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TinhTongCacSoFile {
    public static  final String FILE_NAME="src/ThucHanh/SaocungDuoc.csv";
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file:: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        TinhTongCacSoFile readfileEx = new TinhTongCacSoFile();


        readfileEx.readFileText(FILE_NAME);

    }
    public void readFileText(String filePath) {
        try {
            // đọc file theo đường dẫn
            File file = new File(filePath);
            // KIểm tra nếu file không tồn tại thì ném ra ngoại lệ
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            //đọc từng dòng của file và tiến hành cộng dồn lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine())!= null){
                System.out.println(line);
                sum += Integer.parseInt(line);            }
            br.close();
            System.out.println("Tổng =: " + sum);
        }catch (Exception e) {
            System.out.println("File không tồn tại or nội dung có lỗi!");
        }

    }
}
