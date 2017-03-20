/**
 * ConsoleUI.java
 * PSP Program 3
 * Copyright (c) Universidad de los Andes.
 */

package co.edu.uniandes.ecos.csof5101.psp2.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import co.edu.uniandes.ecos.csof5101.psp2.model.Data;
import co.edu.uniandes.ecos.csof5101.psp2.model.Measuring;

/**
 * ConsoleUI.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 19/03/2017 04:58:29 PM 2017
 */

public class ConsoleUI {
	
	//Instance Variables
	private Data data = new Data();

	/**
	 * Method to get the dataset of the file.
	 * @param path directory of file
	 */
	public void readFile(String path) {
		try {
			BufferedReader br =  new BufferedReader(new FileReader(path));
			String line = br.readLine();
			while (null != line) {
				String[]tokens = line.split(",");
				data.getDataXList().add(Double.valueOf(tokens[0]));
				data.getDataYList().add(Double.valueOf(tokens[1]));
				line = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Failed to get file:" + path);
		}
	}

	/**
	 * Method to print measurings in console.
	 */
	public ArrayList<String> printMeasuring() {
		ArrayList<String> output = new ArrayList<String>();
		if(!data.getDataXList().isEmpty()
		    && !data.getDataYList().isEmpty()){
			output.add("LOC/Pages    Items");
			for (int i = 0; i < data.getDataXList().size(); i++) {
				output.add(data.getDataXList().get(i) + "    " + data.getDataYList().get(i));
			}
			output.add("-------------------------");
			output.add("The relative size range are:");
			output.add("VS  = " + data.getVS());
			output.add("S = " + data.getS());
			output.add("M = " + data.getM());
			output.add("L = " + data.getL());
			output.add("VL = " + data.getVL());
		}
		return output;
	}
	
	/**
	 * Method to print measurings in console.
	 * @param estimadedProxy estimaded proxy value
	 */
	public void calculateMeasuring(){
		Measuring.calculateLNSum(this.data);
		Measuring.calculateAverage(this.data);
		Measuring.calculateVariance(this.data);
		Measuring.calculateStandardDeviation(this.data);
		Measuring.calculateLNRanges(this.data);
		Measuring.calculateRanges(this.data);
	}
	
	/**
	 * @return the data
	 */
	public Data getData() {
		return data;
	}
}
