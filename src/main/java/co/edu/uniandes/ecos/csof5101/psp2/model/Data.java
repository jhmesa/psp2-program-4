/**
 * Data.java
 * PSP Program 2
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Data.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 19/03/2017 04:58:29 PM 2017
 */
public class Data {
	
	//Instance variables
	private List<Double> dataXList = new ArrayList<Double>();
	private List<Double> dataYList = new ArrayList<Double>();
	private double naturalLogarithmSum;
	private double average;
	private double variance;
	private double standardDeviation;
	private double lnVS;
	private double lnS;
	private double lnM;
	private double lnL;
	private double lnVL;
	private double VS;
	private double S;
	private double M;
	private double L;
	private double VL;
	
	/**
	 * @return the dataXList
	 */
	public List<Double> getDataXList() {
		return dataXList;
	}
	
	/**
	 * @param dataXList the dataXList to set
	 */
	public void setDataXList(List<Double> dataXList) {
		this.dataXList = dataXList;
	}
	
	/**
	 * @return the dataYList
	 */
	public List<Double> getDataYList() {
		return dataYList;
	}
	
	/**
	 * @param dataYList the dataYList to set
	 */
	public void setDataYList(List<Double> dataYList) {
		this.dataYList = dataYList;
	}
	
	/**
	 * @return the naturalLogarithmSum
	 */
	public double getNaturalLogarithmSum() {
		return naturalLogarithmSum;
	}
	
	/**
	 * @param naturalLogarithmSum the naturalLogarithmSum to set
	 */
	public void setNaturalLogarithmSum(double naturalLogarithmSum) {
		this.naturalLogarithmSum = naturalLogarithmSum;
	}
	
	/**
	 * @return the average
	 */
	public double getAverage() {
		return average;
	}
	
	/**
	 * @param average the average to set
	 */
	public void setAverage(double average) {
		this.average = average;
	}
	
	/**
	 * @return the variance
	 */
	public double getVariance() {
		return variance;
	}
	
	/**
	 * @param variance the variance to set
	 */
	public void setVariance(double variance) {
		this.variance = variance;
	}
	
	/**
	 * @return the standardDeviation
	 */
	public double getStandardDeviation() {
		return standardDeviation;
	}
	
	/**
	 * @param standardDeviation the standardDeviation to set
	 */
	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	
	/**
	 * @return the lnVS
	 */
	public double getLnVS() {
		return lnVS;
	}
	
	/**
	 * @param lnVS the lnVS to set
	 */
	public void setLnVS(double lnVS) {
		this.lnVS = lnVS;
	}
	
	/**
	 * @return the lnS
	 */
	public double getLnS() {
		return lnS;
	}
	
	/**
	 * @param lnS the lnS to set
	 */
	public void setLnS(double lnS) {
		this.lnS = lnS;
	}
	
	/**
	 * @return the lnM
	 */
	public double getLnM() {
		return lnM;
	}
	
	/**
	 * @param lnM the lnM to set
	 */
	public void setLnM(double lnM) {
		this.lnM = lnM;
	}
	
	/**
	 * @return the lnL
	 */
	public double getLnL() {
		return lnL;
	}
	
	/**
	 * @param lnL the lnL to set
	 */
	public void setLnL(double lnL) {
		this.lnL = lnL;
	}
	
	/**
	 * @return the lnVL
	 */
	public double getLnVL() {
		return lnVL;
	}
	
	/**
	 * @param lnVL the lnVL to set
	 */
	public void setLnVL(double lnVL) {
		this.lnVL = lnVL;
	}
	
	/**
	 * @return the vS
	 */
	public double getVS() {
		return VS;
	}
	
	/**
	 * @param vS the vS to set
	 */
	public void setVS(double vS) {
		VS = vS;
	}
	
	/**
	 * @return the s
	 */
	public double getS() {
		return S;
	}
	
	/**
	 * @param s the s to set
	 */
	public void setS(double s) {
		S = s;
	}
	
	/**
	 * @return the m
	 */
	public double getM() {
		return M;
	}
	
	/**
	 * @param m the m to set
	 */
	public void setM(double m) {
		M = m;
	}
	
	/**
	 * @return the l
	 */
	public double getL() {
		return L;
	}
	
	/**
	 * @param l the l to set
	 */
	public void setL(double l) {
		L = l;
	}
	
	/**
	 * @return the vL
	 */
	public double getVL() {
		return VL;
	}
	
	/**
	 * @param vL the vL to set
	 */
	public void setVL(double vL) {
		VL = vL;
	}	
}
