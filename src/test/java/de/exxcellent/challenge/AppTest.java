package de.exxcellent.challenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

/**
 * Example JUnit4 test case.
 * 
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public class AppTest {

	@Test
	public void runFootball() {
		App.main("--football", "football.csv");
	}

	@Test
	public void runWeather() {
		App.main("--weather", "weather.csv");
	}

	@Test
	public void readIn() {
		try {
			ArrayList<String[]> weathercsv = ReadIn.readData("weather.csv");
			assertEquals("Day", weathercsv.get(0)[0]);
			assertEquals("1022.7", weathercsv.get(30)[13]);
			assertEquals("50", weathercsv.get(8)[4]);
		} catch (Exception e) {
		}

	}

	@Test
	public void smallestDistance() {
		DistanceWithLabel distance1 = new DistanceWithLabel("first", 1);
		DistanceWithLabel distance2 = new DistanceWithLabel("second", 2);
		DistanceWithLabel distance3 = new DistanceWithLabel("third", 3);
		ArrayList<DistanceWithLabel> distances = new ArrayList<DistanceWithLabel>() {
			{
				add(distance1);
				add(distance2);
				add(distance3);
			}
		};
		assertEquals(distance1, SmallestDistance.getSmallestDistance(distances));

	}

	@Test
	public void getDistancesWeather() {
		ArrayList<String[]> weathercsv = new ArrayList<String[]>();
		weathercsv.add(new String[] { "headline", "headline", "headline" });
		weathercsv.add(new String[] { "first", "2", "1" });
		weathercsv.add(new String[] { "second", "3", "1" });
		weathercsv.add(new String[] { "third", "4", "1" });
		Weather weather = new Weather(weathercsv);

		DistanceWithLabel distance1 = new DistanceWithLabel("first", 1);
		DistanceWithLabel distance2 = new DistanceWithLabel("second", 2);
		DistanceWithLabel distance3 = new DistanceWithLabel("third", 3);
		ArrayList<DistanceWithLabel> distances = new ArrayList<DistanceWithLabel>() {
			{
				add(distance1);
				add(distance2);
				add(distance3);
			}
		};
		assertEquals(distances.get(0).getDistance(), weather.getDistances().get(0).getDistance());
		assertEquals(distances.get(1).getDistance(), weather.getDistances().get(1).getDistance());
		assertEquals(distances.get(2).getDistance(), weather.getDistances().get(2).getDistance());
		assertEquals(distances.get(0).getLabel(), weather.getDistances().get(0).getLabel());
		assertEquals(distances.get(1).getLabel(), weather.getDistances().get(1).getLabel());
		assertEquals(distances.get(2).getLabel(), weather.getDistances().get(2).getLabel());
	}

	@Test
	public void getDistancesFootball() {
		ArrayList<String[]> footballcsv = new ArrayList<String[]>();
		footballcsv.add(new String[] { "headline" });
		footballcsv.add(new String[] { "first", "0", "0", "0", "0", "2", "1" });
		footballcsv.add(new String[] { "second", "0", "0", "0", "0", "3", "1" });
		footballcsv.add(new String[] { "third", "0", "0", "0", "0", "4", "1" });
		Football football = new Football(footballcsv);

		DistanceWithLabel distance1 = new DistanceWithLabel("first", 1);
		DistanceWithLabel distance2 = new DistanceWithLabel("second", 2);
		DistanceWithLabel distance3 = new DistanceWithLabel("third", 3);
		ArrayList<DistanceWithLabel> distances = new ArrayList<DistanceWithLabel>() {
			{
				add(distance1);
				add(distance2);
				add(distance3);
			}
		};
		assertEquals(distances.get(0).getDistance(), football.getDistances().get(0).getDistance());
		assertEquals(distances.get(1).getDistance(), football.getDistances().get(1).getDistance());
		assertEquals(distances.get(2).getDistance(), football.getDistances().get(2).getDistance());
		assertEquals(distances.get(0).getLabel(), football.getDistances().get(0).getLabel());
		assertEquals(distances.get(1).getLabel(), football.getDistances().get(1).getLabel());
		assertEquals(distances.get(2).getLabel(), football.getDistances().get(2).getLabel());
	}

}