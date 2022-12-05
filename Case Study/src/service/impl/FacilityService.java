package service.impl;

import model.Facility;
import model.Room;
import model.Villa;
import service.IFacilityIService;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityService  implements IFacilityIService {

    private static final Map<Facility,Integer> facilityList = new LinkedHashMap<>();

    static {
//        Villa villa = new Villa("PenHouse",3000,5000,2500,"1 Year","Normal",500,6);
//        Villa villa1 = new Villa("QuanHouse",2000,3000,1500,"1 Year","Normal",500,6);
//        facilityList.put(villa,5);
//        facilityList.put(villa1,4);
//
//        Room room = new Room("Quan",2000,5000,600,"1 Year","free");
//        Room room1 = new Room("Quan1",2000,5000,600,"1 Year","free");
//        facilityList.put(room,5);
//        facilityList.put(room1,4);

    }


    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()){
            System.out.println(entry);
        }
    }

    @Override
    public void addNewFacility(Facility facility) {

    }

    @Override
    public void displayListMaintenance() {
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()){
            if (entry.getValue() >= 5 ){
                System.out.println("Entry can bao tri");
            }
        }
    }

    @Override
    public void addVilla(Villa villa) {
        facilityList.put(villa,0);
    }

    @Override
    public void addRoom(Room room) {
        facilityList.put(room,0);
    }
}
