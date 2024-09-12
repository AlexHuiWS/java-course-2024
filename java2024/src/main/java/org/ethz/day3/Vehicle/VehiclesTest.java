package org.ethz.day3.Vehicle;

import org.ethz.day3.Network.Link;
import org.ethz.day3.Network.Node;

public class VehiclesTest {
	public static void main(String[] args) {

		Node fromNode = new Node(0.0, 0.0, "0");
		Node toNode = new Node(0.0, 50.0, "1");
		String[] allowedModes = new String[2];
		allowedModes[0] = "car";
		allowedModes[1] = "pt";
		Link link = new Link(fromNode, toNode, "1",allowedModes, 50, 50, 10);
		
		VehiclesOnLink vehiclesOnLink = new VehiclesOnLink(link);
		
		Car car1 = new Car("1", 4, 2.2, "Ford");
		Bus bus1 = new Bus("2", 40,30, 2.2, "ZVV");
		vehiclesOnLink.addVehicle(car1);
		vehiclesOnLink.addVehicle(bus1);
		System.out.println("Capacities of all vehicles currently on the link are:");

		vehiclesOnLink.printCapacities();
		
		vehiclesOnLink.removeVehicle(car1);
		System.out.println();
		System.out.println("Capacities of all vehicles currently on the link are:");

		vehiclesOnLink.printCapacities();

		boolean ind = vehiclesOnLink.removeVehicle(car1);
		System.out.println(ind);
	}    
    
}
