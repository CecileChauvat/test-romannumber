//package fr.insalyon.telecom.mgl;
import java.util.HashMap;

public class RomanNumberConverter{

	HashMap<String,Integer> corres = new HashMap<String,Integer>();
	String RomanNumber;
	int number;

	public RomanNumberConverter (String RomanNumber){
		corres.put("I",1);
		corres.put("V",5);
		corres.put("X",10);
		corres.put("L",50);
		corres.put("C",100);
		corres.put("D",500);
		corres.put("M",1000);
		this.RomanNumber = new String(RomanNumber);
	}
	public RomanNumberConverter (int number){
		corres.put("I",1);
		corres.put("V",5);
		corres.put("X",10);
		corres.put("L",50);
		corres.put("C",100);
		corres.put("D",500);
		corres.put("M",1000);
		this.number = number;
	}
	public static int convert(){
		if (this.romanNumber == null) {
      			throw new IllegalArgumentException("argument cannot be null");
    		}
		int res;
		int[] tab = new int[romanNumber.length()];
		
		for (int i=0;i<romanNumber.length();i++){
			tab[i] = corres.get(romanNumber.charAt(i));
			System.out.print(tab[i]);
		}
		return 0;
	}

	public String convert(int number){
		
	
	return "test";
	}
	

}
