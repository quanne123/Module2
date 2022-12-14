package service;

import model.facility.Facility;
import model.facility.Room;

import java.io.IOException;
import java.util.Map;

public interface IRoomIOService {
    Map<Room,Integer> readFile(String path) throws IOException;

    void writeFile(String path,Map<Room,Integer> roomList) throws IOException;

}
