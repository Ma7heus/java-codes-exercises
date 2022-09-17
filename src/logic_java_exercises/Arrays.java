package logic_java_exercises;

import java.math.BigDecimal;

public class Arrays {
	public static void main(String[] args) {
		
		String[] cars = {"Volks","bmw"};		
		int[] primos = {1,2,3,5,7,11,13,17,19,23};
		double numero = 10.2645;
		BigDecimal[] bigdecimal = {new BigDecimal(numero)}; 
		
		
	System.out.println(primos[3]);
	System.out.println(cars[1]);
	System.out.println(bigdecimal[0]);
	System.out.println(Math.min(primos[5],65));
	
	double ram = Math.random()*50;
	System.out.println(ram);
		
		
		
		
	}
	
	
}
