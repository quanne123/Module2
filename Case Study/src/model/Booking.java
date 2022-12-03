package model;

public class Booking  {
    private int idBooking;
    private String begin;
    private String end;
    private String nameService;



    public int cus(){
       Customer customer=new Customer();
      return customer.getIdCustomer();
    }




}
