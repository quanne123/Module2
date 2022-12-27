package service.IoImpl;

import model.Book;
import service.IBookIOService;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BookIOServiceImpl implements IBookIOService {

    @Override
    public Map<Book, Integer> readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<Book,Integer> bookListMap = new HashMap<>();
        while ((line = bufferedReader.readLine())!= null){
            String[] bo = line.split(",");
            Book book = new Book(Integer.parseInt(bo[0]),bo[1],Integer.parseInt(bo[2]),bo[3],Integer.parseInt(bo[4]));
            bookListMap.put(book,Integer.parseInt(bo[5]));
        }
        bufferedReader.close();
        fileReader.close();
        return bookListMap;
    }

    @Override
    public void writeFile(String path, Map<Book, Integer> bookMap) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Book,Integer> entry : bookMap.entrySet()){
            bufferedWriter.write(entry.getKey().formatCSVBook() + "," + entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
