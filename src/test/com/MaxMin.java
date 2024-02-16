package test.com;

public class MaxMin {
	
	int[] num;
	public MaxMin(int...array) {
		this.num = array;
		
	}
	
	int maxNumber() {
		int sum1=-100;
		for(int value:num) {                                                       
			if(value >sum1)
			
			sum1=value;
		}
		return sum1;
	}
	int minNumber() {
		int sum2=100;
		for(int value:num) {
			if(value<sum2)
			sum2=value;
		}
		return sum2;
	}

	public static void main(String[] args) {
		
		MaxMin run = new MaxMin(-8,-2,-3,-1,-6,-10);
		int max =  run.maxNumber();
		System.out.println("Max numberis print "+max);
		
		int min =  run.minNumber();
		System.out.println("min numberis print "+min);
		
		System.out.println("Second");
		
		MaxMin run1 = new MaxMin(1,4,3,66,8,6);
		int max1 =  run1.maxNumber();
		System.out.println("Max numberis print "+max1);
		
	}
	

}
