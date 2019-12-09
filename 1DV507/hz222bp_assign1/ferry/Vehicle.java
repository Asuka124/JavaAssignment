package hz222bp_assign1.ferry;

import java.util.*;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public abstract class Vehicle {
	private String kind; // Distinguish each vehicle

	private int maxp; // max number of passenger on the vehicle
	private int vfee = 0; // vehicle ticket
	private int pfee = 0; // passenger ticket
	private int space = 0; // the space of each vehicle

	private int actualp = 0; // actual number of passenger on the vehicle
	ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public Vehicle(String ve) {
		this.kind = ve;
	}

	public void setvehicle(String ve) {
		//check if the vehicle is on the ferry
		for (int i = 0; i < vehicle.size(); i++) {
			if (vehicle.get(i).getvehicle().equals(ve)) { 
				System.out.println("This vehicle has been embarked.");
			}
		}
		kind = ve;
	}

	public String getvehicle() {
		return kind;
	}

	public void addPasenger() {
		if (getMaxPassNumber() > getActualPassengerNumber()) {
			actualp++;
		} else {
			System.err.println("The " + kind + " can not hold more passengers");
		}
	}

	public int getActualPassengerNumber() {
		return actualp;
	}

	public int getMaxPassNumber() {
		return maxp;
	}

	public int getVehiclefee() {
		return vfee;
	}

	public int getPassengerfee() {
		return pfee;
	}

	public int getSpace() {
		return space;
	}
}
