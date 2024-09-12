package org.ethz.day3.Activity;

public interface Activity extends PlanElement {

    public double getEndTime();
    public void setEndTime(final double second);
    // The void keyword specifies that a method should not have a return value.

    public String getType();
    public void setType(final String type);

    public double getXCoord();
    public double getYCoord();
    public void setXCoord(final double xCoord);
    public void setYCoord(final double yCoord);

}
