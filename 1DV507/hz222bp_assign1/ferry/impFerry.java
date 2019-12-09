package hz222bp_assign1.ferry;

import java.util.ArrayList;
import java.util.Iterator;
/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public class impFerry implements Ferry {
	private final int maxVehicleSpace = 200; // maximum space for vehicle in the basic unit "bicycle"

	private int income = 0;
	ArrayList<Vehicle> vehicle = new ArrayList<Vehicle>();
	ArrayList<Passenger> pass = new ArrayList<Passenger>();

	@Override
	public int countPassengers() { // the actual number of passengers
		int allp = 0;
		for (int i = 0; i < vehicle.size(); i++) {
			allp += vehicle.get(i).getActualPassengerNumber();
		}

		for (int i = 0; i < pass.size(); i++) {
			allp += pass.get(i).getPassengerNumber();
		}
		return allp;
	}

	@Override
	public int countVehicleSpace() {
		int allv = 0;
		for (int i = 0; i < vehicle.size(); i++) {
			allv += vehicle.get(i).getSpace();
		}
		return allv;
	}

	@Override
	public int countMoney() {
		return income;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		Iterator<Vehicle> iv = vehicle.iterator();
		while (iv.hasNext()) {
			Vehicle vehicle = iv.next();
			System.out.println(vehicle);
		}
		return iv;
	}

	@Override
	public void embark(Vehicle v) {
		if (hasSpaceFor(v)) {
			vehicle.add(v);

			income += v.getActualPassengerNumber() * v.getPassengerfee();
			income += v.getVehiclefee();
		} else {
			System.err.println("Not enough space for vehicle.");
		}
	}

	@Override
	public void embark(Passenger p) {
		if (hasRoomFor(p)) {
			pass.add(p);
			income += p.getPassengerNumber() * 20;
		} else {
			System.err.println("Not enough space for passenger.");
		}
	}

	@Override
	public void disembark() {
		vehicle.clear();
		pass.clear();
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		if ((maxVehicleSpace - countVehicleSpace()) >= v.getSpace()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean hasRoomFor(Passenger p) {
		int sum = 0;
		for (int i = 0; i < pass.size(); i++) {
			sum += pass.get(i).getPassengerNumber();
		}
		if ((200 - countPassengers()) >= sum) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		String now = "There are " + " " + vehicle.size() + " vihecle(s) and " + countPassengers()
				+ " passenger(s) on the ferry. " + "\nNow the income is " + countMoney() + " kr.";
		return now;
	}
}
