package org.westzone.milan.model;

import java.util.Date;

public class Registration {
    private Integer id;

    private String milanlocation;

    private String zone;

    private String kendra;

    private String category;

    private String fullname;

    private String gender;

    private String phone;

    private String comment;

    private String accfri;

    private String accsat;

    private String accsun;

    private String accmon;

    private String travelmode;

    private String arrivalairport;

    private String arrivalairline;

    private String arrivaldatetime;

    private Date arrivaldate;

    private Date arrivaltime;

    private String departureairport;

    private String departureairline;

    private String departuredatetime;

    private Date departuredate;

    private Date departuretime;

    private Date registrationdatetime;

    private Boolean bhaktichakracollected;

    private String accomodationType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMilanlocation() {
        return milanlocation;
    }

    public void setMilanlocation(String milanlocation) {
        this.milanlocation = milanlocation == null ? null : milanlocation.trim();
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    public String getKendra() {
        return kendra;
    }

    public void setKendra(String kendra) {
        this.kendra = kendra == null ? null : kendra.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getAccfri() {
        return accfri;
    }

    public void setAccfri(String accfri) {
        this.accfri = accfri == null ? null : accfri.trim();
    }

    public String getAccsat() {
        return accsat;
    }

    public void setAccsat(String accsat) {
        this.accsat = accsat == null ? null : accsat.trim();
    }

    public String getAccsun() {
        return accsun;
    }

    public void setAccsun(String accsun) {
        this.accsun = accsun == null ? null : accsun.trim();
    }

    public String getAccmon() {
        return accmon;
    }

    public void setAccmon(String accmon) {
        this.accmon = accmon == null ? null : accmon.trim();
    }

    public String getTravelmode() {
        return travelmode;
    }

    public void setTravelmode(String travelmode) {
        this.travelmode = travelmode == null ? null : travelmode.trim();
    }

    public String getArrivalairport() {
        return arrivalairport;
    }

    public void setArrivalairport(String arrivalairport) {
        this.arrivalairport = arrivalairport == null ? null : arrivalairport.trim();
    }

    public String getArrivalairline() {
        return arrivalairline;
    }

    public void setArrivalairline(String arrivalairline) {
        this.arrivalairline = arrivalairline == null ? null : arrivalairline.trim();
    }

    public String getArrivaldatetime() {
        return arrivaldatetime;
    }

    public void setArrivaldatetime(String arrivaldatetime) {
        this.arrivaldatetime = arrivaldatetime == null ? null : arrivaldatetime.trim();
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Date getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(Date arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public String getDepartureairport() {
        return departureairport;
    }

    public void setDepartureairport(String departureairport) {
        this.departureairport = departureairport == null ? null : departureairport.trim();
    }

    public String getDepartureairline() {
        return departureairline;
    }

    public void setDepartureairline(String departureairline) {
        this.departureairline = departureairline == null ? null : departureairline.trim();
    }

    public String getDeparturedatetime() {
        return departuredatetime;
    }

    public void setDeparturedatetime(String departuredatetime) {
        this.departuredatetime = departuredatetime == null ? null : departuredatetime.trim();
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    public Date getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(Date departuretime) {
        this.departuretime = departuretime;
    }

    public Date getRegistrationdatetime() {
        return registrationdatetime;
    }

    public void setRegistrationdatetime(Date registrationdatetime) {
        this.registrationdatetime = registrationdatetime;
    }

    public Boolean getBhaktichakracollected() {
        return bhaktichakracollected;
    }

    public void setBhaktichakracollected(Boolean bhaktichakracollected) {
        this.bhaktichakracollected = bhaktichakracollected;
    }

    public String getAccomodationType() {
        return accomodationType;
    }

    public void setAccomodationType(String accomodationType) {
        this.accomodationType = accomodationType == null ? null : accomodationType.trim();
    }
}