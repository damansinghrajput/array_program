package test.com;

public class PositiveNumber {
	
	int[] array;
	
	
	PositiveNumber(int[] array){
		this.array = array;
		
	}
	
	
	void pos() {
		
		for(int num:array) {
			
			if(num>0) {
				System.out.println("this are positive number :"+num);
				
			}
			else if(num<0)
				System.out.println("this are negative number :"+num);
			
		}
		
	}
	

	public static void main(String[] args) {
		
		int[] array = {1,2,-3, -5};
		
		PositiveNumber run=new PositiveNumber(array);
		run.pos();
		
				
	}

}
