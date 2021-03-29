package com.warehouseapp.activities.Model;

public class WareHouse {
    private String location;
    private String address;
    private String phoneNo;

    public WareHouse(String location, String address, String phoneNo){
        this.location=location;
        this.address=address;
        this.phoneNo = phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
