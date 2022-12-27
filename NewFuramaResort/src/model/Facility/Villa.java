package model.Facility;

public class Villa extends Facility {
    //    -: Tiêu chuẩn phòng, Diện tích hồ bơi, Số tầng.
    private String standard;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String nameService, double area, int cost, int numberTenants, String typeRent, String standard, double areaPool, int floor) {
        super(nameService, area, cost, numberTenants, typeRent);
        this.standard = standard;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
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
                "standard='" + standard + '\'' +
                ", area=" + areaPool +
                ", floor=" + floor +
                "} " + super.toString();
    }

    public String formatCSVVilla(){
        return this.formatCSVFacility() + "," + this.standard + "," + this.areaPool + "," + this.floor;
    }
}
