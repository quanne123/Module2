package service;

import model.Facility;
import model.Room;
import model.Villa;
import service.impl.Service;

import java.util.List;
import java.util.Map;

public interface IFacilityIService extends IService {

    void displayFacility();

    void addNewFacility(Facility facility);

    void displayListMaintenance();

    void addVilla(Villa villa);

    void addRoom(Room room);

}
