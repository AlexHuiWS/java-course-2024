package org.ethz.day3.Activity;

public class ActivityImpl implements Activity {
    private double endTime;
	private String type;
	private double xCoord;
	private double yCoord;

    public ActivityImpl(double endTime, String type, 
    double xCoord, double yCoord) {
        this.endTime = endTime;
        this.type = type;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public double getEndTime() {
        return this.endTime;
    }

    @Override
    public void setEndTime(final double second) {
        this.endTime = second;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(final String type) {
        this.type = type;
    }

    public double getXCoord() {
        return this.xCoord;
    }

    public double getYCoord() {
        return this.yCoord;
    }

    public void setXCoord(final double xCoord) {
        this.xCoord = xCoord;
    }

    public void setYCoord(final double yCoord) {
        this.yCoord = yCoord;
    }

}
