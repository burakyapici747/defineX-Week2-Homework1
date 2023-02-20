package model;

import enums.HomeType;

public class SummerHome extends Home{
    public SummerHome(double price, double squareMeter, int numberOfRooms, int numberOfHalls, HomeType homeType) {
        this.price = price;
        this.squareMeter = squareMeter;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
        this.homeType = homeType;
    }
}
