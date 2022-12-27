package model.Facility;

public class Facility {
//    Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày).
    private String nameService;
    private double Area;
    private int cost;
    private int numberTenants;
    private String typeRent;

    protected Facility() {
    }

    protected Facility(String nameService, double area, int cost, int numberTenants, String typeRent) {
        this.nameService = nameService;
        Area = area;
        this.cost = cost;
        this.numberTenants = numberTenants;
        this.typeRent = typeRent;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double area) {
        Area = area;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumberTenants() {
        return numberTenants;
    }

    public void setNumberTenants(int numberTenants) {
        this.numberTenants = numberTenants;
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
                "nameService='" + nameService + '\'' +
                ", Area=" + Area +
                ", cost=" + cost +
                ", numberTenants=" + numberTenants +
                ", typeRent='" + typeRent + '\'' +
                '}';
    }
    public String formatCSVFacility(){
        return this.nameService + "," + this.Area + "," + this.cost + "," + this.numberTenants + "," + this.typeRent;
    }
}
