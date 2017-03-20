/**
 * DataTest.java
 * PSP Program 4
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import co.edu.uniandes.ecos.csof5101.psp2.model.Data;

/**
 * DataTest.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 19/03/2017 04:58:29 PM 2017
 */
public class DataTest {

	/**
	 * Method to test the method setDataXList.
	 */
	@Test
	public void setDataXListTest(){
		Data data = new Data();
		List<Double> dataXList = new ArrayList<Double>();
		data.setDataXList(dataXList);
		assertEquals(dataXList, data.getDataXList());
	}
	
	/**
	 * Method to test the method setDataYList.
	 */
	@Test
	public void setDataYListTest(){
		Data data = new Data();
		List<Double> dataYList = new ArrayList<Double>();
		data.setDataYList(dataYList);
		assertEquals(dataYList, data.getDataYList());
	}
	
	/**
	 * Method to test the method setNaturalLogarithmSum.
	 */
	@Test
	public void setNaturalLogarithmSumTest(){
		Data data = new Data();
		data.setNaturalLogarithmSum(12.0);
		assertEquals(12.0, data.getNaturalLogarithmSum(), 0.0);
	}
	
	/**
	 * Method to test the method setAverage.
	 */
	@Test
	public void setAverageTest(){
		Data data = new Data();
		data.setAverage(12.0);
		assertEquals(12.0, data.getAverage(), 0.0);
	}
	
	/**
	 * Method to test the method setVariance.
	 */
	@Test
	public void setVarianceTest(){
		Data data = new Data();
		data.setVariance(12.0);
		assertEquals(12.0, data.getVariance(), 0.0);
	}
	
	/**
	 * Method to test the method setStandardDeviation.
	 */
	@Test
	public void setStandardDeviationTest(){
		Data data = new Data();
		data.setStandardDeviation(12.0);
		assertEquals(12.0, data.getStandardDeviation(), 0.0);
	}
	
	/**
	 * Method to test the method setLnVS.
	 */
	@Test
	public void setLnVSTest(){
		Data data = new Data();
		data.setLnVS(12.0);
		assertEquals(12.0, data.getLnVS(), 0.0);
	}
	
	/**
	 * Method to test the method setLnS.
	 */
	@Test
	public void setLnSTest(){
		Data data = new Data();
		data.setLnS(12.0);
		assertEquals(12.0, data.getLnS(), 0.0);
	}
	
	/**
	 * Method to test the method setLnM.
	 */
	@Test
	public void setLnMTest(){
		Data data = new Data();
		data.setLnM(12.0);
		assertEquals(12.0, data.getLnM(), 0.0);
	}
	
	/**
	 * Method to test the method setLnL.
	 */
	@Test
	public void setLnLTest(){
		Data data = new Data();
		data.setLnL(12.0);
		assertEquals(12.0, data.getLnL(), 0.0);
	}
	
	/**
	 * Method to test the method setLnVL.
	 */
	@Test
	public void setLnVLTest(){
		Data data = new Data();
		data.setLnVL(12.0);
		assertEquals(12.0, data.getLnVL(), 0.0);
	}
	
	/**
	 * Method to test the method setVS.
	 */
	@Test
	public void setVSTest(){
		Data data = new Data();
		data.setVS(12.0);
		assertEquals(12.0, data.getVS(), 0.0);
	}
	
	/**
	 * Method to test the method setS.
	 */
	@Test
	public void setSTest(){
		Data data = new Data();
		data.setS(12.0);
		assertEquals(12.0, data.getS(), 0.0);
	}
	
	/**
	 * Method to test the method setM.
	 */
	@Test
	public void setMTest(){
		Data data = new Data();
		data.setM(12.0);
		assertEquals(12.0, data.getM(), 0.0);
	}
	
	/**
	 * Method to test the method setL.
	 */
	@Test
	public void setLTest(){
		Data data = new Data();
		data.setL(12.0);
		assertEquals(12.0, data.getL(), 0.0);
	}
	
	/**
	 * Method to test the method setVL.
	 */
	@Test
	public void setVLTest(){
		Data data = new Data();
		data.setVL(12.0);
		assertEquals(12.0, data.getVL(), 0.0);
	}
}
