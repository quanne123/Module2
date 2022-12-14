package service;

import model.facility.Facility;
import model.facility.Room;
import model.facility.Villa;

import java.io.IOException;
import java.util.Map;

public interface IFacilityService {
     String BOP = "1234";

    void  displayFacility() throws IOException;

    void getMaintaince() throws IOException;

    void addVilla(Villa villa) throws IOException;

    void addRoom(Room room) throws IOException;

}

