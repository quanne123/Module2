package model.Facility;

public class Room extends Facility {
//    -: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    private String freeService;
    public Room() {
    }

    public Room(String nameService, double area, int cost, int numberTenants, String typeRent, String freeService) {
        super(nameService, area, cost, numberTenants, typeRent);
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
