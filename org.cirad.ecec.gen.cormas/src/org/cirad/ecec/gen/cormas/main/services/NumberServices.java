package org.cirad.ecec.gen.cormas.main.services;

import java.util.Locale;

public class NumberServices {
	
	public String getRandomDouble() {
		
		   //int minimum = Integer.parseInt(min);
		  // int maximum = Integer.parseInt(max);
		   int minimum = 0;
		   int maximum = 1;
		   double r = Math.random();
		   if (r < 0.5) {
		      return String.format(Locale.ENGLISH,"%.6f", ((1 - Math.random()) * (maximum - minimum) + minimum));
		   }
		   return String.format (Locale.ENGLISH,"%.6f",(Math.random() * (maximum - minimum) + minimum));
	    
	}

		
}
