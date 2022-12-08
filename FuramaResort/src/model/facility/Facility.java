package model.facility;

public abstract class Facility {
    private String serviceName;
    private int area;
    private int costRent;
    private int numberOfTenants;
    private String typeRent;

    protected Facility() {
    }

    protected Facility(String serviceName, int area, int costRent, int numberOfTenants, String typeRent) {
        this.serviceName = serviceName;
        this.area = area;
        this.costRent = costRent;
        this.numberOfTenants = numberOfTenants;
        this.typeRent = typeRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
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

    public String getTypeRent() {
        return typeRent;
    }

    public void setTypeRent(String typeRent) {
        this.typeRent = typeRent;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", costRent=" + costRent +
                ", numberOfTenants=" + numberOfTenants +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
}
