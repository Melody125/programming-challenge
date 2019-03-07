package de.exxcellent.challenge;

import java.util.*;

/**
 * calculates and gives the difference of the temperature 
 * @author Melanie Braun
 *
 */
public class Weather extends WithDistance {

	public Weather(ArrayList<String[]> csvfile) {
		super(csvfile);
	}

	@Override
	/**
	 * returns the distance between the min temperature and max temperature of the day
	 */
	public ArrayList<DistanceWithLabel> getDistances() {
		if (distances == null) {
			distances = new ArrayList<DistanceWithLabel>();
			for (String[] line : csvfile) {
				int max = Integer.parseInt(line[1]);
				int min = Integer.parseInt(line[2]);
				int distance = max - min;
				distances.add(new DistanceWithLabel(line[0], distance));
			}
		}
		return distances;
	}

}
