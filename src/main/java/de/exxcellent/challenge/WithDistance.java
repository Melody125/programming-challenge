package de.exxcellent.challenge;

import java.util.*;

/**
 * A class for things with distances read in from a csv file
 * @author Melanie Braun
 *
 */
public abstract class WithDistance {
	
	protected ArrayList<DistanceWithLabel> distances;
	protected ArrayList<String[]> csvfile;
	
	public WithDistance(ArrayList<String[]> csvfile) {
		this.csvfile = csvfile;
		this.csvfile.remove(0);
		distances = null;
	}
	
	public abstract ArrayList<DistanceWithLabel> getDistances();
}
