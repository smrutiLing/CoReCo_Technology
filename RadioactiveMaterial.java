package Task;

public class RadioactiveMaterial {

	    public static void main(String[] args) {
	        double initialMass = 100; // grams
	        double halfLifeYears = 5; // years 
	        int numberOfHalfLives = 3; 

	        double remainingMass = calculateRemainingMass(initialMass, numberOfHalfLives);
	        double yearsElapsed = calculateYearsElapsed(halfLifeYears, numberOfHalfLives);

	        System.out.println("Remaining Mass: " + remainingMass + " grams");
	        System.out.println("Years Elapsed: " + yearsElapsed + " years");
	    }

	    public static double calculateRemainingMass(double initialMass, int numberOfHalfLives) {
	        return initialMass * Math.pow(0.5, numberOfHalfLives);
	    }

	    public static double calculateYearsElapsed(double halfLifeYears, int numberOfHalfLives) {
	        return halfLifeYears * numberOfHalfLives;
	    }
	
}
