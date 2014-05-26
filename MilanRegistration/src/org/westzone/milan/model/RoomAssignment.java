package org.westzone.milan.model;

import java.util.Date;

public class RoomAssignment {
    private Integer hotelRoomID;

    private Date date;

    private Integer registrationID;

    private String comments;

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

    public Integer getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(Integer registrationID) {
        this.registrationID = registrationID;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }
}