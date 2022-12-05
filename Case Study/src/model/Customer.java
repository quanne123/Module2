package model;

public class Customer extends Person {
    private int idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(int idCustomer, String name, String dateOfBirth, String gender, String numberCard, String phone, String email, String typeCustomer, String address) {
        super( name, dateOfBirth, gender, numberCard, phone, email);
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.idCustomer= idCustomer;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCustomer=" + idCustomer +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                "} " + super.toString();
    }
}
