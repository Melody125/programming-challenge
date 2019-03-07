package de.exxcellent.challenge;

/**
 * The class is a componsite of a distance and its label
 * @author Melanie Braun
 *
 */
public class DistanceWithLabel{
	private String label;
	private int distance;

	public DistanceWithLabel(String label, int distance){
		this.label= label;
		this.distance =distance;
	}
	 
	 public String getLabel() {
		 return label;
	 }
	 
	 public int getDistance() {
		 return distance;
	 }
	
	}
	
