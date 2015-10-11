package examples.solid;

import static java.util.Arrays.asList;

import java.util.List;

public class ISP {

	public static void main(String[] args) {
		Destination paradise = new Destination();
		CarManufacturer carManufacturer = new CarManufacturer();
		carManufacturer.setProducableVehicles(asList(new Vehicle(), new Vehicle(), new Vehicle()));
		carManufacturer.shipVehicles(paradise);
		Score score = carManufacturer.conductEnvironmentalBenchmark();
		
		CarPaymentModule paymentModule = new CarPaymentModule();
		paymentModule.payDay(carManufacturer);
	}
	
	private static class CarPaymentModule {
		private List<Employee> allEmployees = asList(new Employee(), new Employee());
		
		public void payDay(CarManufacturer manufacturer) {
			Adress billableAdress = manufacturer.getBillableAdress();
			manufacturer.payEmployees(allEmployees);
			manufacturer.setProducableVehicles(null);
		}
	}
	
	private static class CarManufacturer {
		public Adress getBillableAdress() {
			return null;
		}

		public void shipVehicles(Destination destination) {
		}

		public void payEmployees(List<Employee> employees) {
		}

		public void setProducableVehicles(List<Vehicle> vehicles) {
		}

		public Score conductEnvironmentalBenchmark() {
			return null;
		}
	}

	private static class Score {
	}

	private static class Employee {
	}

	private static class Vehicle {
	}

	private static class Destination {
	}

	private static class Adress {
	}
}
