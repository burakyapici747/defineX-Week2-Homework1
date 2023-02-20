package model;

import enums.HomeType;

public abstract class Home {
    protected double price;
    protected double squareMeter;
    protected int numberOfRooms;
    protected int numberOfHalls;
    protected HomeType homeType;

    public double getPrice() {
        return price;
    }

    public double getSquareMeter() {
        return squareMeter;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfHalls() {
        return numberOfHalls;
    }

    public HomeType getHomeType() {
        return homeType;
    }


    @Override
    public String toString() {
        return "Home{" +
                "price=" + price +
                ", squareMeter=" + squareMeter +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfHalls=" + numberOfHalls +
                ", homeType=" + homeType +
                '}';
    }
}
