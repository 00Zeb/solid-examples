package examples.solid;

public class LSP {

	public static void main(String[] args) {
		Truck truck = new Truck();
		prepareForJourney(truck, new Cargo());
		truck.accelerate();
	}

	private static void prepareForJourney(Vehicle vehicle, Cargo cargo) {
		vehicle.openTrunk();
		if (vehicle instanceof Car) {
			((Car) vehicle).loadTrunk(cargo);
		}
		if (vehicle instanceof Truck) {
			((Truck) vehicle).loadShipment(cargo);
		}
	}

	private static abstract class Vehicle {
		public void accelerate() {
		}

		public void openTrunk() {
		}
	}

	private static class Car extends Vehicle {
		public void loadTrunk(Cargo cargo) {
		}
	}

	private static class Truck extends Vehicle {
		public void loadShipment(Cargo cargo) {
		}
	}

	private static class Cargo {
	}
}
