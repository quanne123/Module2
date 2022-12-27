package service.IoImpl;

import model.Magazine;
import service.IMagazineIOService;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class MagazineIOServiceImpl implements IMagazineIOService {
    @Override
    public Map<Magazine, Integer> readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<Magazine,Integer> magazineListMap = new HashMap<>();
        while ((line = bufferedReader.readLine())!= null){
           String[] mg = line.split(",");
           Magazine magazine = new Magazine(Integer.parseInt(mg[0]),mg[1],Integer.parseInt(mg[2]),Integer.parseInt(mg[3]),Integer.parseInt(mg[4]));
           magazineListMap.put(magazine,Integer.parseInt(mg[5]));
        }
        bufferedReader.close();
        fileReader.close();
        return magazineListMap;
    }

    @Override
    public void writeFile(String path, Map<Magazine, Integer> magazineListMap) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Map.Entry<Magazine,Integer> entry : magazineListMap.entrySet()){
            bufferedWriter.write(entry.getKey().formatCSVMagazine() + "," + entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
