package service.impl;

import model.Facility.Facility;
import model.Facility.Room;
import model.Facility.Villa;
import service.IFacilityService;
import service.IRoomIOService;
import service.IVillaIOService;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService implements IFacilityService {
    private static final Map<Facility,Integer> facilityList = new LinkedHashMap<>();

    static {
        Facility villa = new Villa("Villa-01",2,3,5,"Year","ViP",50,60);
        Facility villa1 = new Villa("Villa-02",3,3,5,"Year","ViP",50,60);
        facilityList.put(villa,0);
        facilityList.put(villa1,5);

        Facility room = new Room("Room-01",12,56,13,"Month","BreakFast");
        Facility room1 = new Room("Room-02",12,56,13,"Month","BreakFast");
        facilityList.put(room,0);
        facilityList.put(room1,5);
    }
    private final String ROOM_PATH_NAME = "src/data/room.csv";
    private final String VILLA_PATH_NAME = "src/data/villa.csv";
    private final IVillaIOService villaIOService = new VillaIOServiceImpl();
    private final IRoomIOService roomIOService = new RoomIOServiceImpl();


    @Override
    public void getFacility() throws IOException {
        Map<Villa,Integer> villaList = this.villaIOService.readFile(VILLA_PATH_NAME);
        facilityList.putAll(villaList);
        Map<Room,Integer> roomList = this.roomIOService.readFile(ROOM_PATH_NAME);
        facilityList.putAll(roomList);
        for (Map.Entry<Facility,Integer> entry : facilityList.entrySet()){
            System.out.println(entry.getKey() + "Used: " + entry.getValue() + " time");
        }
    }

    @Override
    public void getMaintenance() throws IOException {
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
        villaList.put(villa,0);
        this.villaIOService.writeFile(VILLA_PATH_NAME,villaList);
    }

    @Override
    public void addRoom(Room room) throws IOException {
        Map<Room,Integer> roomList = this.roomIOService.readFile(ROOM_PATH_NAME);
        roomList.put(room,0);
        this.roomIOService.writeFile(ROOM_PATH_NAME,roomList);
    }
}
