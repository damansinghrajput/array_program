package test.com;


public class SumOfAllElement {


	
	 public int totalSum(int[] array) {
		 
		 
	int	sum=0;
	for(int num:array) {
		
		sum+=num;
	
	}
	return sum;
		
	}
	
	public static void main(String[] args) {
		int[] array = {10,20,30,50};
		SumOfAllElement run = new SumOfAllElement();
		int sum	=run.totalSum(array);
		System.out.println("Total Sum Of Element : "+sum);
		
		
		
		
	}

	
		
		
		
	}


