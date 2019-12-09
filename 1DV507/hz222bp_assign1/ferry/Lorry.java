package hz222bp_assign1.ferry;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/

public class Lorry extends Vehicle {
	public Lorry(String lorry) {
		super(lorry);
	}

	@Override
	public final int getVehiclefee() {
		return 300;
	}

	@Override
	public final int getPassengerfee() {
		return 15;
	}

	@Override
	public final int getSpace() {
		return 40;
	}

	public final int getMaxPassNumber() {
		return 2;
	}
}
