package de.exxcellent.challenge;

import java.io.FileReader;
import java.util.ArrayList;

/**
 * The entry class for your solution. This class is only aimed as starting point
 * and not intended as baseline for your software design. Read: create your own
 * classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 * @author Melanie Braun
 */
public final class App {

	/**
	 * This is the main entry method of your program.
	 * 
	 * @param args The CLI arguments passed
	 */
	public static void main(String... args) {

		// Your preparation code …
		try {

			ArrayList<String[]> csv = ReadIn.readData(args[1]);
			WithDistance withDistance = null;
			String text="";
			if (args[0].equals("--weather")) {
				 withDistance = new Weather(csv);
				 text = "Day with smallest temperature spread : ";
			}
			else if (args[0].equals("--football")) {
				 withDistance = new Football(csv);
				 text = "Team with smallest goal spread       : ";
			}
			else {
				System.out.println("Only --weather or --football are allowed as first argument you wrote "+ args[0]);
				System.exit(1);
			}
			String smallestdistance = SmallestDistance.getSmallestDistance(withDistance.getDistances()).getLabel();
			System.out.println(text + smallestdistance);
			
			/*
			 * ArrayList<String[]> weathercsv = ReadIn.readData("weather.csv"); WithDistance
			 * withDistance = new Weather(weathercsv); DistanceWithLabel distance =
			 * SmallestDistance.getSmallestDistance(withDistance.getDistances()); String
			 * dayWithSmallestTempSpread = distance.getLabel(); // Your day analysis
			 * function call …
			 * System.out.printf("Day with smallest temperature spread : %s%n",
			 * dayWithSmallestTempSpread);
			 * 
			 * ArrayList<String[]> footballcsv = ReadIn.readData("football.csv");
			 * withDistance = new Football(footballcsv); distance =
			 * SmallestDistance.getSmallestDistance(withDistance.getDistances()); String
			 * teamWithSmallestGoalSpread = distance.getLabel(); // Your goal analysis
			 * function call …
			 * System.out.printf("Team with smallest goal spread       : %s%n",
			 * teamWithSmallestGoalSpread);
			 */
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
