package com.au.allotedv5;

/**
 * Created by Abhishek-Pc on 04-01-2016.
 */
public class Retriveddata {
    private String monday;
    private String tuesday;
    private String wenesday;
    private String thursday;
    private String friday;
    private Long Id;
    private String Registration_Number;
    private String NAME;
    String Taken ;

    public String getTaken() {
        return Taken;
    }

    public void setTaken(String taken) {
        Taken = taken;
    }
    public void setNAME(String NAME) {
        this.NAME = NAME;
    }



    public String getNAME() {
        return NAME;
    }



    public String getRegistration_Number() {
        return Registration_Number;
    }

    public void setRegistration_Number(String registration_Number) {
        Registration_Number = registration_Number;
    }



    public void setId(Long id) {
        Id = id;
    }



    public Long getId() {
        return Id;
    }


    public void setMonday(String monday) {
        this.monday = monday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public void setWenesday(String wenesday) {
        this.wenesday = wenesday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getMonday() {
        return monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public String getWenesday() {
        return wenesday;
    }

    public String getThursday() {
        return thursday;
    }

    public String getFriday() {
        return friday;
    }

    @Override
    public String toString() {

        return Registration_Number+"\t"+"-" +"\t"+NAME;
    }

    public void delete(Retriveddata xretriveddata) {
        xretriveddata=null;
    }
}
