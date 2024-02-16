package test.com;

import java.util.Arrays;

public class StringArray {
	private String[] name;
	
	StringArray(String...name1 ){
		this.name=name1;
		
	}
	
	
	public void weekDay() {
		
		System.out.println( Arrays.toString(name));
		
		
	}
	 String mostDay() {
		 String getMostDigit = "";
		 for(String day:name) {
		 if(day.length()>getMostDigit.length()) {
			 getMostDigit = day;
		 }
		 }
		 
		 return getMostDigit;
	 }
	 
	
	public static void main(String[] args) {
		StringArray week = new StringArray ("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday");
		week.weekDay();
		String day = week.mostDay();
		System.out.println("most number of letter " +day);
	}

}
