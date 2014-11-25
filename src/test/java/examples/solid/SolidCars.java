package examples.solid;

import java.util.Arrays;
import java.util.List;

public class SolidCars {
	
	public static void main(String[] args) {
		Car audi80 = new Car("Audi 80 sedan", new PetrolEngine());
		Car volkswagenPassat = new Car("VW Passat Wagon",new HybridEngine());
		Car skodaFaultyEngine = new Car("Skoda",new FaultyEngine());
		CarManufacturer manufacturer = new CarManufacturer(Arrays.asList(audi80, volkswagenPassat, skodaFaultyEngine));
		System.out.println(manufacturer.getProduceableCars());
	}

	//OCP
	private static class CarManufacturer {
		private List<Car> produceableCars;

		public CarManufacturer(List<Car> produceableCars) {
			this.produceableCars = produceableCars;
		}
		
		public void shipCars() {
			//produce and ship.
		}

		public List<Car> getProduceableCars() {
			return produceableCars;
		}
	}
	
	//DIP here
	private static class Car {
		private String model;
		private Engine engine;
		
		public Car(String model, Engine engine) {
			this.model = model;
			this.engine = engine;
		}
		public String toString() {
			return model + "(" + engine.getClass().getSimpleName() + ")";
		}
	}
	
	private static interface Engine {
		void start();
	}
	
	private static class PetrolEngine implements Engine {
		public void start() {
		}
	}
	
	private static class HybridEngine implements Engine {
		public void start() {
		}
	}
	
	//Breaking LSP
	private static class FaultyEngine implements Engine {
		public void start() {
			throw new RuntimeException("faulty engine");
		}
	}
}
