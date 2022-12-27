package service.impl;

import model.Facility.Room;
import service.IRoomIOService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class RoomIOServiceImpl implements IRoomIOService {

    @Override
    public Map<Room, Integer> readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        Map<Room,Integer> roomList = new LinkedHashMap<>();
        while ((line = bufferedReader.readLine())!= null){
            String[] ro = line.split(",");
            Room room = new Room(ro[0],Double.parseDouble(ro[1]),Integer.parseInt(ro[2]),Integer.parseInt(ro[3]),ro[4],ro[5]);
            roomList.put(room,Integer.parseInt(ro[6]));
        }
        bufferedReader.close();
        fileReader.close();
        return roomList;
    }

    @Override
    public void writeFile(String path, Map<Room, Integer> roomList) throws IOException {
        FileWriter fileWriter = new FileWriter(path);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (Map.Entry<Room,Integer> entry : roomList.entrySet()){
            bufferedWriter.write(entry.getKey().formatCSVRoom() + "," + entry.getValue());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
}
