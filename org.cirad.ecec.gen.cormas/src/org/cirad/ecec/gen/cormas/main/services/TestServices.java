package org.cirad.ecec.gen.cormas.main.services;
import org.cirad.ecec.gen.cormas.main.services.NumberServices;
import org.cirad.ecec.gen.cormas.main.services.StringServices;

public class TestServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberServices rs = new NumberServices();
		StringServices ss = new StringServices();
		System.out.println(rs.getRandomDouble() + " : " + ss.now());
		System.exit(0);
		
	}

}
