package examples.solid;

public class DIP {

	public static void main(String[] args) {
		Car v70 = new Car("Volvo V70");
		v70.start();
	}

	private static class Car {
		private String model;
		private Engine engine = new PetrolEngine();
		private System system = new System();

		public Car(String model) {
			this.model = model;
		}

		public void start() {
			system.initiateProperties();
			engine.ignite();
			system.check();
		}
	}

	private static interface Engine {
		void ignite();
	}

	private static class PetrolEngine implements Engine {
		public void ignite() {
		}
	}

	private static class HybridEngine implements Engine {
		public void ignite() {
		}
	}

	private static class System {
		public void initiateProperties() {
		}

		public void check() {
		}
	}
}
