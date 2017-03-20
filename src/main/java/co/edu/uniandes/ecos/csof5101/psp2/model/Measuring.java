/**
 * Measuring.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.model;

/**
 * Measuring.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 19/03/2017 04:58:29 PM 2017
 */

public final class Measuring {
	
	/**
	 * Method for calculating the natural logarithm sum of the data set.
	 * @param data Object containing the data set
	 */
	public static void calculateLNSum(Data data){
		Double lnSum = 0.0;
		for (int i = 0; i < data.getDataXList().size(); i++) {
			double number1 = data.getDataXList().get(i);
			double number2 = data.getDataYList().get(i);
			lnSum += Math.log(number1 / number2);
		}
		data.setNaturalLogarithmSum(lnSum);
	}
	
	/**
	 * Method to calculate the average of the natural logarithms of the dataset.
	 * @param data Object containing the data set
	 */
	public static void calculateAverage(Data data){
		double naturalLogarithmSum = data.getNaturalLogarithmSum();
		double n = data.getDataXList().size();
		data.setAverage(naturalLogarithmSum/n);
	}
	
	/**
	 * Method for calculating the variance for the data set.
	 * @param data Object containing the data set
	 */
	public static void calculateVariance(Data data){
		Double sumValTemp = 0.0;
		double n = data.getDataXList().size();
		for (int i = 0; i < data.getDataXList().size(); i++) {
			double number1 = data.getDataXList().get(i);
			double number2 = data.getDataYList().get(i);
			double ln = Math.log(number1 / number2);
			double valTemp = Math.pow((ln-data.getAverage()), 2);
			sumValTemp += valTemp;
		}
		data.setVariance(sumValTemp / (n-1));
	}
	
	/**
	 * Method for calculating the standard deviation of the data set.
	 * @param data Object containing the data set
	 */
	public static void calculateStandardDeviation(Data data){
		data.setStandardDeviation(Math.sqrt(data.getVariance()));
	}
	
	/**
	 * Method to calculate the ranges of the natural logarithms for VS, S, M, L and VL.
	 * @param data Object containing the data set
	 */
	public static void calculateLNRanges(Data data){
		data.setLnVS(data.getAverage() - (2 * data.getStandardDeviation()));
		data.setLnS(data.getAverage() - data.getStandardDeviation());
		data.setLnM(data.getAverage());
		data.setLnL(data.getAverage() + data.getStandardDeviation());
		data.setLnVL(data.getAverage() + (2 * data.getStandardDeviation()));
	}
	
	/**
	 * Method to calculate antilogarithms for VS, S, M, L and VL.
	 * @param data Object containing the data set
	 */
	public static void calculateRanges(Data data){
		double eulerNumber = 2.71828;
		data.setVS(Math.pow(eulerNumber,data.getLnVS()));
		data.setS(Math.pow(eulerNumber,data.getLnS()));
		data.setM(Math.pow(eulerNumber,data.getLnM()));
		data.setL(Math.pow(eulerNumber,data.getLnL()));
		data.setVL(Math.pow(eulerNumber,data.getLnVL()));
	}
}