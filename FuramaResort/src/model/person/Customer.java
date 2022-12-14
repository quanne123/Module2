package model.person;

public class Customer extends Person {
    private int idCustomer;
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String gender, String idCard, String phone, String email, int idCustomer, String typeCustomer, String address) {
        super(name, dateOfBirth, gender, idCard, phone, email);
        this.idCustomer = idCustomer;
        this.typeCustomer = typeCustomer;
        this.address = address;
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
    public String FormatCSVForCustomer() {
        return this.getIdCustomer() + "," + this.getName() + "," + this.getDateOfBirth() + "," + this.getGender() + "," + this.getIdCustomer() + "," + this.getPhone() + "," + this.getEmail() + "," + this.getTypeCustomer()+","+ this.getAddress();


    }
}
