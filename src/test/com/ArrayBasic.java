package test.com;
import java.math.BigDecimal; 
import java.math.*;
    // Student student = new student (name , list of marks)
public class ArrayBasic {
	
	private String name;
	private int[] marks;
	
	

	ArrayBasic(String name , int...values){
		 this.name = name;
		 this.marks = values;
		
	}
	private int getNumberofMarks() {
		
		return marks.length;
	}
	private int getTotalMark() {
		int sum = 0;
		for(int mark:marks) {
			sum+=mark;
			}
		return sum;
		
	}
	
	
	private int getMaximumMark() {
		
		int max  = 0;
		for(int mark:marks) {
			if(mark>max) {
			max=mark;
			}
			}
		
		return max;
	}
	
	private void getMinimumMark() {
		int mini  = 23;
		for(int mark:marks) {
			if(mark<mini) {
				System.out.println("fail");
			}
			}
		
		
	}
	
	private BigDecimal getAverageMarks() {
		int sum =getTotalMark();
		int number = getNumberofMarks();
		 
		return new BigDecimal (sum).divide(new BigDecimal(number),3,RoundingMode.UP);
	}
	
	
	public static void main(String[] args) {
		//int [] marks = {100,97,95};
		ArrayBasic student = new ArrayBasic("daman",97,98,58,69,26);
		int number = student.getNumberofMarks();
		System.out.println("Number of Marks " +number);
		
        int totalMark= student.getTotalMark();
        System.out.println("Total Marks " +totalMark);
        
        int maximumMark = student.getMaximumMark();
        System.out.println("Max Number "+maximumMark);
        
        student.getMinimumMark();
       
        
        BigDecimal average = student.getAverageMarks();
        System.out.println("Average Number " +average);
}
	
	
}



	
