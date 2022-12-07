package service;

import model.Facility;
import model.Room;
import model.Villa;

public interface IFacilityIService extends IService {

    void getFacility();

    void addNewFacility(Facility facility);

    void getFacilityMaintance();

    void addVilla(Villa villa);

    void addRoom(Room room);

}
