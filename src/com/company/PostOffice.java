package com.company;

public class PostOffice {

    public String City;
    public String Address;
    public int NumberVisitors;
    public boolean isInternational;
    private int NumberOrders;

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getNumberVisitors() {
        return NumberVisitors;
    }

    public void setNumberVisitors(int numberVisitors) {
        NumberVisitors = numberVisitors;
    }

    public boolean isInternational() {
        return isInternational;
    }

    public void setInternational(boolean international) {
        isInternational = international;
    }

    public int getNumberOrders() {
        return NumberOrders;
    }

    public void setNumberOrders(int numberOrders) {
        NumberOrders = numberOrders;
    }

    public PostOffice() {


    }

}
