package controller;

import model.facility.Facility;
import model.facility.Room;
import model.facility.Villa;
import service.IFacilityService;
import service.impl.FacilityServiceImpl;

import java.io.IOException;
import java.util.Map;

public class FacilityController {
    private final IFacilityService facilityService = new FacilityServiceImpl();

    public void displayFacility(){
        try {
            this.facilityService.displayFacility();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayMaintenance(){
        try {
            this.facilityService.getMaintaince();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addVilla(Villa villa){
        try {
            this.facilityService.addVilla(villa);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void addRoom(Room room){
        try {
            this.facilityService.addRoom(room);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
