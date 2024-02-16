package test.com;



public class LargestSecondnNumber {
	
	
	public int findSecondLargestElement(int[] array) {

	    if(array.length == array[0] || array.length == array[1] ){
	        
	        return -1;
	    }
	    
	    
	    
	        return 0;
	    }
	

	public static void main(String[] args) {
	int[] array = {1,2};
	LargestSecondnNumber run = new LargestSecondnNumber();
		System.out.println(run.findSecondLargestElement(array));
	
	
	}

}
