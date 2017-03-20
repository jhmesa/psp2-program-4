/**
 * MeasuringTest.java
 * PSP Program 4
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.model.Measuring;
import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * MeasuringTest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 19/03/2017 04:58:29 PM 2017
 */

public class MeasuringTest{
	
	/**
	 * Method to test the method calculateLNSum.
	 */
	@Test
	public void calculateLNSumTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		assertEquals(36.41972788469591, face.getData().getNaturalLogarithmSum(), 0.0);
	}
	/**
	 * Method to test the method calculateAverage.
	 */
	@Test
	public void calculateAverageTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		Measuring.calculateAverage(face.getData());
		assertEquals(2.801517529591993, face.getData().getAverage(), 0.0);
	}
	
	/**
	 * Method to test the method calculateVariance.
	 */
	@Test
	public void calculateVarianceTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		Measuring.calculateAverage(face.getData());
		Measuring.calculateVariance(face.getData());
		assertEquals(0.43625283003464466, face.getData().getVariance(), 0.0);
	}
	
	/**
	 * Method to test the method calculateStandardDeviation.
	 */
	@Test
	public void calculateStandardDeviationTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		Measuring.calculateAverage(face.getData());
		Measuring.calculateVariance(face.getData());
		Measuring.calculateStandardDeviation(face.getData());
		assertEquals(0.6604943830454917, face.getData().getStandardDeviation(), 0.0);
	}
	
	/**
	 * Method to test the method calculateLNRanges.
	 */
	@Test
	public void calculateLNRangesTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		Measuring.calculateAverage(face.getData());
		Measuring.calculateVariance(face.getData());
		Measuring.calculateStandardDeviation(face.getData());
		Measuring.calculateLNRanges(face.getData());
		assertEquals(1.4805287635010096, face.getData().getLnVS(), 0.0);
	}
	
	/**
	 * Method to test the method calculateRanges.
	 */
	@Test
	public void calculateRangesTest(){
		ConsoleUI face = new ConsoleUI();
		face.readFile("./src/test/resources/data.txt");
		Measuring.calculateLNSum(face.getData());
		Measuring.calculateAverage(face.getData());
		Measuring.calculateVariance(face.getData());
		Measuring.calculateStandardDeviation(face.getData());
		Measuring.calculateLNRanges(face.getData());
		Measuring.calculateRanges(face.getData());
		assertEquals(4.395264747312791, face.getData().getVS(), 0.0);
	}
}
