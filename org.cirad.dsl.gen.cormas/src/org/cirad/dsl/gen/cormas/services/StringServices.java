package org.cirad.dsl.gen.cormas.services;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringServices {

	public String now() {
		return new SimpleDateFormat("E d MMM yyyy").format(new Date());
	}

	public String noSpecials(String in) {
		in  = in.replace('©', 'e');
		in  = in.replace('¨', 'e');
		in  = in.replace(' ', 'a');
		in  = in.replace('´', 'o');
		return in.replaceAll("[^a-zA-Z0-9]", "");
	}
}
