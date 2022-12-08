package model.facility;

public class Villa extends Facility {
    private String standardRoom;
    private int areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String serviceName, int area, int costRent, int numberOfTenants, String typeRent, String standardRoom, int areaPool, int floor) {
        super(serviceName, area, costRent, numberOfTenants, typeRent);
        this.standardRoom = standardRoom;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(int areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standardRoom='" + standardRoom + '\'' +
                ", areaPool=" + areaPool +
                ", floor=" + floor +
                "} " + super.toString();
    }
}
