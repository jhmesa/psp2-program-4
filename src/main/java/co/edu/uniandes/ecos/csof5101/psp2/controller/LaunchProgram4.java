/**
 * LaunchProgram3.java
 * PSP Program 2
 * Copyright (c) Universidad de los Andes.
 */
package co.edu.uniandes.ecos.csof5101.psp2.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import static spark.Spark.*;
import co.edu.uniandes.ecos.csof5101.psp2.view.ConsoleUI;

/**
 * LaunchProgram3.
 * 
 * @author Javier Mesa
 * @version 1.0
 * @since 05/03/2017 04:58:29 PM 2017
 */

public class LaunchProgram4 {

	/**
	 * Launch the application.
	 * @param args inputs arguments for the application
	 */
	public static void main(String[] args) {
		port(Integer.valueOf(System.getenv("PORT")));
	    staticFileLocation("/public");
		get("/:path", (req, res) -> {
			  String path = req.params(":path");
			  res.status(400);
			  Map<String, Object> attributes = new HashMap<>();
		      attributes.put("message", "Hello World!");
			  return new ModelAndView(attributes, "index.ftl");
		}, new FreeMarkerEngine());
		
		
		/*ConsoleUI face = new ConsoleUI();
		String path = "C:\\Users\\jaher\\Desktop\\data.txt";
		double estimadedProxy = 0;
		for (String string : args) {
			path += string;
		}
		if(path  != null && !path.equalsIgnoreCase("")){
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter estimaded proxy:");
			estimadedProxy = reader.nextDouble();
			reader.close();
		}
		face.readFile(path);
		face.calculateMeasuring(estimadedProxy);
		face.printMeasuring();*/
	}
}
