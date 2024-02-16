package test.com;

public class PositiveNumberSum {
	
	int[] array;
	
	
	PositiveNumberSum(int[] array){
		this.array = array;
		
	}
    
	
        int positiveNum() {
        	int  sum= 0;
        	for(int num : array) {
        		
        		if(num>0) {
        			sum+=num;
        		
        		}
        		else if(num<0)
        			sum+=num;
        	}
        	
        return sum; 
	
	
}

public static void main(String[] args) {
	int[] array = { 1, 2,5,3,5,8 ,-1,-2,-4};

	PositiveNumberSum run = new PositiveNumberSum(array);
	int sum1 = run.positiveNum();
	System.out.println("All Total Postive Number Sum :" + sum1);
		
		
		
		
		
	}
	}


