package service.impl;

import model.facility.Facility;
import model.facility.Room;
import model.facility.Villa;
import service.IFacilityService;
import service.IRoomIOService;
import service.IVillaIOService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityServiceImpl  implements IFacilityService {
    private static final Map<Facility,Integer> facilityList = new LinkedHashMap<>();

    static{
        Facility villa = new Villa("Villa01", 39,
            1000, 2, "Day", "Suite", 38, 1);
        facilityList.put(villa,0);
    }
    private final String VILLA_PATH_NAME = "E:\\Codegym\\Module2\\FuramaResort\\src\\data\\villa01.csv";
    private final String ROOM_PATH_NAME = "E:\\Codegym\\Module2\\FuramaResort\\src\\data\\room01.csv";
    private final IVillaIOService villaIOService = new VillaIOServiceimpl();
    private final IRoomIOService roomIOService = new RoomIOService();

    @Override
    public void displayFacility() throws IOException {
        Map<Villa,Integer> villaList = this.villaIOService.readFile(VILLA_PATH_NAME);
        facilityList.putAll(villaList);
        Map<Room,Integer> roomList = this.roomIOService.readFile(ROOM_PATH_NAME);
        facilityList.putAll(roomList);
        for (Map.Entry<Facility,Integer> entry : facilityList.entrySet()){
            System.out.println(entry);
        }
    }

    @Override
    public void getMaintaince() throws IOException {
        Map<Villa,Integer> villaList = this.villaIOService.readFile(VILLA_PATH_NAME);
        facilityList.putAll(villaList);
        Map<Room,Integer> roomList = this.roomIOService.readFile(ROOM_PATH_NAME);
        facilityList.putAll(roomList);
        for (Map.Entry<Facility,Integer> entry : facilityList.entrySet()){
            if (entry.getValue() >= 5){
                System.out.println(entry);
            }
        }
    }

    @Override
    public void addVilla(Villa villa) throws IOException {
        Map<Villa,Integer> villaList = this.villaIOService.readFile(VILLA_PATH_NAME);

        facilityList.put(villa,0);
        this.villaIOService.writeFile(VILLA_PATH_NAME,villaList);
    }

    @Override
    public void addRoom(Room room) throws IOException {
        Map<Room,Integer> roomList = this.roomIOService.readFile(ROOM_PATH_NAME);
        facilityList.put(room,0);
        this.roomIOService.writeFile(ROOM_PATH_NAME,roomList);
    }

}
