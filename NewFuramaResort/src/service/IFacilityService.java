package service;

import model.Facility.Facility;
import model.Facility.Room;
import model.Facility.Villa;

import java.io.IOException;
import java.util.Map;

public interface IFacilityService {
    void getFacility() throws IOException;

    void getMaintenance() throws IOException;

    void addVilla(Villa villa) throws IOException;

    void addRoom(Room room) throws IOException;

}
