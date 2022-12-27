package controller;

import model.Facility.Room;
import model.Facility.Villa;
import service.IFacilityService;
import service.impl.FacilityService;

import java.io.IOException;

public class FacilityController {
    private final IFacilityService facilityService = new FacilityService();

    public void display(){
        try {
            facilityService.getFacility();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void displayMainTenance(){
        try {
            facilityService.getMaintenance();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addVilla(Villa villa){
        try {
            facilityService.addVilla(villa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addRoom(Room room){
        try {
            facilityService.addRoom(room);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
