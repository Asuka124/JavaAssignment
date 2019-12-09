package hz222bp_assign1.ferry;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public class Car extends Vehicle {
	public Car(String car) {
		super(car);
	}

	@Override
	public final int getVehiclefee() {
		return 100;
	}

	@Override
	public final int getPassengerfee() {
		return 15;
	}

	@Override
	public final int getSpace() {
		return 5;
	}

	public final int getMaxPassNumber() {
		return 4;
	}
}