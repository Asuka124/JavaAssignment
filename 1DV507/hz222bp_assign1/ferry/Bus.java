package hz222bp_assign1.ferry;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public class Bus extends Vehicle {
	public Bus(String bus) {
		super(bus);
	}

	@Override
	public final int getVehiclefee() {
		return 200;
	}

	@Override
	public final int getPassengerfee() {
		return 10;
	}

	@Override
	public final int getSpace() {
		return 20;
	}

	public final int getMaxPassNumber() {
		return 20;
	}
}
