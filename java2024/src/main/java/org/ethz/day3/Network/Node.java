package org.ethz.day3.Network;

public class Node { 
    private double xCoord;
    private double yCoord;
    private String id;

    public Node (double xCoord, double yCoord, String id) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        this.id = id;
    }
    public double getXCoord() {
        return xCoord;
    }
    public double getYCoord() {
        return yCoord;
    }
    public String getId() {
        return id;
    }
}
