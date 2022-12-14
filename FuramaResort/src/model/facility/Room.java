package model.facility;

public class Room extends Facility {

    private String freeService;


    public Room() {
    }

    public Room(String serviceName, int area, int costRent, int numberOfTenants, String typeRent, String freeService) {
        super(serviceName, area, costRent, numberOfTenants, typeRent);
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
    public String formatCSVRoom(){
        return this.formatCSVFacility() + "," + this.freeService;
    }
}

