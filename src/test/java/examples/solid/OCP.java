package examples.solid;

import java.util.ArrayList;
import java.util.List;

public class OCP {

	public static void main(String[] args) {
		VolvoManufacturer volvoManufacturer = new VolvoManufacturer();
		System.out.println(volvoManufacturer.getProduceableCars());
	}

	private static class VolvoManufacturer {
		private List<Vehicle> produceableCars = new ArrayList<Vehicle>() {
			{
				add(new S60());
				add(new FMTruck());
				add(new S80());
				add(new XC60());
			}
		};

		public void shipCars() {
			// produce and ship.
		}

		public List<Vehicle> getProduceableCars() {
			return produceableCars;
		}
	}

	private static interface Vehicle {
	}

	private abstract static class Motorbike implements Vehicle {
	}

	private static class FMTruck extends Motorbike {
	}

	private abstract static class Car implements Vehicle {
	}

	private static class S60 extends Car {
	}

	private static class S80 extends Car {
	}

	private static class XC60 extends Car {
	}
}
