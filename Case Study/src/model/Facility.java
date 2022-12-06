package model;

public abstract class Facility {
    private String nameService;
    private int area;
    private int costRent;
    private int numberOfTenants;
    private String rentalType;

    protected Facility(String nameService, int area, int costRent, int numberOfTenants, String rentalType) {
        this.nameService = nameService;
        this.area = area;
        this.costRent = costRent;
        this.numberOfTenants = numberOfTenants;
        this.rentalType = rentalType;
    }
    public Facility() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getCostRent() {
        return costRent;
    }

    public void setCostRent(int costRent) {
        this.costRent = costRent;
    }

    public int getNumberOfTenants() {
        return numberOfTenants;
    }

    public void setNumberOfTenants(int numberOfTenants) {
        this.numberOfTenants = numberOfTenants;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", area=" + area +
                ", costRent=" + costRent +
                ", numberOfTenants=" + numberOfTenants +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
