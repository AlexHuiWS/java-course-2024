package org.ethz.day3.Network;

public class Link {
    private Node fromNode;
    private Node toNode;
    private String id;
    private String[] modes;
    private double length;
    private int allowedSpeed;
    private double capacity;

    public Link (Node fromNode, Node toNode, String id, String[] modes, double length, int allowedSpeed, double capacity) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.id = id;
        this.modes = modes;
        this.length = length;
        this.allowedSpeed = allowedSpeed;
        this.capacity = capacity;
    }

    public Node getFromNode() {
        return fromNode;
    }
    public Node getToNode() {
        return toNode;
    }
    public String getId() {
        return id;
    }
    public String[] getModes() {
        return modes;
    }
    public double getLength() {
        return length;
    }
    public int getAllowedSpeed() {
        return allowedSpeed;
    }
    public double getCapacity() {
        return capacity;
    }
}
