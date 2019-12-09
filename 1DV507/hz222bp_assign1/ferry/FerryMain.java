package hz222bp_assign1.ferry;

/*Assignment 1; Exercise 2
 *Hailing Zhang(hz222bp) 
 *2017-01-18*/
public class FerryMain {
	public static void main(String[] args) {
		impFerry ferry = new impFerry();

		// embark the passenger
		Passenger passenger = new Passenger();
		ferry.embark(passenger);

		// embark the bicycle
		Vehicle bicycle = new Bicycle("bicycle");
		bicycle.addPasenger();
		bicycle.addPasenger(); // overload exception
		ferry.embark(bicycle);

		// embark the car
		Vehicle car = new Car("car");
		car.addPasenger();
		car.addPasenger();
		car.addPasenger();
		car.addPasenger();
		ferry.embark(car);
		Vehicle car1 = new Car("car1"); // embark the another car
		ferry.embark(car1);
		car1.addPasenger();

		// embark the car
		Vehicle lorry = new Lorry("lorry");
		ferry.embark(lorry);
		lorry.addPasenger();
		lorry.addPasenger();

		//ferry.embark(lorry);// re-embark exception
		//lorry.addPasenger();

		// embark the bus
		Vehicle bus = new Bus("bus");
		ferry.embark(bus);
		bus.addPasenger();

		// for check the maximum space exception
		
		System.out.println(ferry.toString());
		ferry.disembark();
		System.out.println(ferry.toString());
	}
}