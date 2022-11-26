package BaiTap;
import java.io.*;
public class CopyFileText {
    public static final String SOURCE_FILE = "src/BaiTap/File1.csv";
    public static  final String TARGET_FILE = "src/BaiTap/File2.csv";


    public void writeFile(String SOURCE_FILE) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(SOURCE_FILE);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("Anh Quân\n");
            bufferedWriter.write("Văn Trưởng\n");
            bufferedWriter.write("Hữu Hoàng\n");
            bufferedWriter.write("Hữu Tài\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void copyFile(String SOURCE_FILE, String TARGET_FILE) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(TARGET_FILE);
            fileReader = new FileReader(SOURCE_FILE);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line + "\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                bufferedReader.close();
                fileWriter.close();
                fileReader.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void readFromFile(String TARGET_FILE) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            file = new File(TARGET_FILE);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            fileReader = new FileReader(TARGET_FILE);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng CopyFileText.
        CopyFileText copyFileText = new CopyFileText();

        // Ghi data vào file source_file, gọi phương thức writeFile với tham số truyền vào là file chứa dữ liệu data.
        copyFileText.writeFile(SOURCE_FILE);

        // Copy từ file source_file vào file target_file, gọi phương thức copyFile
        // với tham số đầu tiên là file copy, tham số thứ 2 là file paste.
        copyFileText.copyFile(SOURCE_FILE, TARGET_FILE);

        // Đọc file vừa paste, gọi phương thức readFromFile với tham số truyền vào là file cần đọc.
        copyFileText.readFromFile(TARGET_FILE);
    }

}


