package org.westzone.milan.model;

import java.util.List;

public class Room {
    private String virtualRoomNum;

    private String hotelName;

    private String roomType;

    private Integer roomNum;

    private String availableThur;

    private String availableFri;

    private String availableSat;

    private String availableSun;

    private String availableMon;
    
    private List<Registration> registrations;

    public List<Registration> getRegistrations() {
		return registrations;
	}

	public void setRegistrations(List<Registration> registrations) {
		this.registrations = registrations;
	}

	public String getVirtualRoomNum() {
        return virtualRoomNum;
    }

    public void setVirtualRoomNum(String virtualRoomNum) {
        this.virtualRoomNum = virtualRoomNum == null ? null : virtualRoomNum.trim();
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    public Integer getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(Integer roomNum) {
        this.roomNum = roomNum;
    }

    public String getAvailableThur() {
        return availableThur;
    }

    public void setAvailableThur(String availableThur) {
        this.availableThur = availableThur == null ? null : availableThur.trim();
    }

    public String getAvailableFri() {
        return availableFri;
    }

    public void setAvailableFri(String availableFri) {
        this.availableFri = availableFri == null ? null : availableFri.trim();
    }

    public String getAvailableSat() {
        return availableSat;
    }

    public void setAvailableSat(String availableSat) {
        this.availableSat = availableSat == null ? null : availableSat.trim();
    }

    public String getAvailableSun() {
        return availableSun;
    }

    public void setAvailableSun(String availableSun) {
        this.availableSun = availableSun == null ? null : availableSun.trim();
    }

    public String getAvailableMon() {
        return availableMon;
    }

    public void setAvailableMon(String availableMon) {
        this.availableMon = availableMon == null ? null : availableMon.trim();
    }
}