package examples.solid;

public class SRP {

	public static void main(String[] args) {
		CarRatingSystem carRatingSystem = new CarRatingSystem();
		carRatingSystem.evaluate(new Car());
	}

	private static class CarRatingSystem {
		public Score evaluate(Car car) {
			Score environmentalFriendliness = runEnvironmentalTestTrack(car);
			Score price = runPricePerformance(car);
			Score attractiveness = conductAttractivenessSurvey(car);
			return scoreEvaluation(environmentalFriendliness, price, attractiveness);
		}

		private Score scoreEvaluation(Score environmentalFriendliness, Score price, Score attractiveness) {
			// doing complex calculations
			return null;
		}

		private Score conductAttractivenessSurvey(Car car) {
			// doing complex calculations
			return null;
		}

		private Score runPricePerformance(Car car) {
			// doing complex calculations
			return null;
		}

		private Score runEnvironmentalTestTrack(Car car) {
			// doing complex calculations
			return null;
		}
	}

	private static class Money {
	}

	private static class Score {
	}

	private static class Car {
	}
}
