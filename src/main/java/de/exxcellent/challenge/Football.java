package de.exxcellent.challenge;

import java.util.ArrayList;

/**
 * calculates and gives the difference of the goals and goals allowed
 * @author Melanie Braun
 *
 */
public class Football extends WithDistance {

	public Football(ArrayList<String[]> csvfile) {
		super(csvfile);
	}

	@Override
	/**
	 * returns the difference of the goals and goals allowed
	 */ 
	public ArrayList<DistanceWithLabel> getDistances() {
		if (distances == null) {
			distances = new ArrayList<DistanceWithLabel>();
			for (String[] line : csvfile) {
				int goals = Integer.parseInt(line[5]);
				int goalsallowed = Integer.parseInt(line[6]);
				int distance = Math.abs(goals - goalsallowed);
				distances.add(new DistanceWithLabel(line[0], distance));
			}
		}
		return distances;
	}

}
