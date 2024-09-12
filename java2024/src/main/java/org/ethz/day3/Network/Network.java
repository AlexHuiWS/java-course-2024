package org.ethz.day3.Network;

public class Network {
    private Node[] nodes;
    private Link[] links;

    public Network (Node[] nodes, Link[] links) {
        this.nodes = nodes;
        this.links = links;
    }
    
    public Node[] getNodes() {
        return nodes;
    }
    public Link[] getLinks() {
        return links;
    }
}
