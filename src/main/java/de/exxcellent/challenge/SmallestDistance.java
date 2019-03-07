package de.exxcellent.challenge;

import java.util.ArrayList;

/**
 * This class searches for one of the smallest distances
 * @author Melanie Braun
 *
 */
public class SmallestDistance {
	/**
	 * Searches one of the smallest distance
	 * @param distances all distances which should be compared
	 * @return the DistanceWithLabel with the smallest distances
	 */
	public static DistanceWithLabel getSmallestDistance(ArrayList<DistanceWithLabel> distances) {
		int smallestDistance=distances.get(0).getDistance();
		DistanceWithLabel smallestEntry = distances.get(0);
		for (DistanceWithLabel distanceEntry : distances) {
			if(distanceEntry.getDistance()< smallestDistance) {
				smallestDistance = distanceEntry.getDistance();
				smallestEntry = distanceEntry;
			}
		}
		return smallestEntry;
	}
}
