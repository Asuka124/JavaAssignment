package hz222bp_assign1.ferry;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public class Bicycle extends Vehicle {
	public Bicycle(String bic) {
		super(bic);
	}

	@Override
	public final int getVehiclefee() {
		return 20;
	}

	@Override
	public final int getPassengerfee() {
		return 20;
	}

	@Override
	public final int getSpace() {//the smallest space as the basic unit
		return 1;
	}

	public final int getMaxPassNumber() {
		return 1;
	}
}
