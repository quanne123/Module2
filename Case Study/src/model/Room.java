package model;

public class Room extends Facility{
    private String freeService;

    public Room() {
    }

    public Room(String nameService, int area, int costRent, int numberOfTenants, String rentalType, String freeService) {
        super(nameService, area, costRent, numberOfTenants, rentalType);
        this.freeService = freeService;
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                "} " + super.toString();
    }
}
