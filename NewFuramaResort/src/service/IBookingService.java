package service;

import model.Facility.Booking;

import java.util.Set;

public interface IBookingService {
    void addNewBooking(Booking booking);

    Set<Booking> getBooking();

}
