package org.ethz.day3.Network;

public class TestNetwork {
    public static void main(String[] args) {
        // Declare variables
        Node[] nodes = new Node[4];
        Link[] links = new Link[4];

        // Define nodes
        nodes[0] = new Node(0.0, 0.0, "0");
		nodes[1] = new Node(100.0, 0.0, "1");
		nodes[2] = new Node(100.0, 50.0, "2");
		nodes[3] = new Node(0.0, 50.0, "3");

        // Define links
        String[] allowedModes = new String[2];
		allowedModes[0] = "car";
		allowedModes[1] = "pt";
        links[0] = new Link(nodes[0], nodes[1], "0", allowedModes, 100, 50, 50);
        links[1] = new Link(nodes[1], nodes[2], "1", allowedModes, 100, 50, 50);
        links[2] = new Link(nodes[2], nodes[3], "2", allowedModes, 100, 50, 50);
        links[3] = new Link(nodes[3], nodes[0], "3", allowedModes, 100, 50, 50);

        // Define network
        Network testNetwork = new Network(nodes, links);

        // Print coordinates of nodes
        System.out.println("Coordinates of all nodes in the network are:");
		for (Node node : testNetwork.getNodes()) {
			System.out.println("ID " + node.getId() + 
			": (" + node.getXCoord() + ", " + node.getYCoord() + ")");
		}
    }
}
