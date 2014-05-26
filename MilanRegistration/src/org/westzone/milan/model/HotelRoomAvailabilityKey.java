package org.westzone.milan.model;

import java.util.Date;

public class HotelRoomAvailabilityKey {
    private Integer hotelRoomID;

    private Date date;

    public Integer getHotelRoomID() {
        return hotelRoomID;
    }

    public void setHotelRoomID(Integer hotelRoomID) {
        this.hotelRoomID = hotelRoomID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}