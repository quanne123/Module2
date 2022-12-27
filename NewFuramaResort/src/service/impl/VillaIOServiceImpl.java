package service.impl;

import model.Facility.Villa;
import service.IVillaIOService;

import java.io.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class VillaIOServiceImpl implements IVillaIOService {

    @Override
    public Map<Villa, Integer> readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<Villa,Integer> villaList = new LinkedHashMap<>();
        while ((line = bufferedReader.readLine())!= null){
            String[] vil = line.split(",");
            Villa villa = new Villa(vil[0],Double.parseDouble(vil[1]),Integer.parseInt(vil[2]),Integer.parseInt(vil[3]),vil[4],vil[5],Double.parseDouble(vil[6]),Integer.parseInt(vil[7]));
            villaList.put(villa,Integer.parseInt(vil[8]));
        }
        bufferedReader.close();
        fileReader.close();
        return villaList;
    }

    @Override
    public void writeFile(String path, Map<Villa, Integer> villaList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Map.Entry<Villa,Integer> entry : villaList.entrySet()){
            bufferedWriter.write(entry.getKey().formatCSVVilla() + "," + entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
