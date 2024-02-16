package test.com;


public class FindDuplicate {
	
	
	int[] array;
	
	FindDuplicate (int[] array){
		this.array = array;
	} 
	
	
	public int delete() {
	// int[] value = new int[1];
		int value = 0;
	for(int i=0 ; i<array.length;i++) {
		
		for(int j=array.length-1;j>=0;j--) {
			
			if(i!=j) {
				
				if(array[i]==array[j]) {
					
					value = array[i];
					
				}
			}
		
		
		}
		}
	return value;
	
		
		
	}
	

	public static void main(String[] args) {
		int[] array = {1,3,4,2,2};
		
		 FindDuplicate run = new  FindDuplicate(array);
		
		 System.out.println((run.delete()));
		
	}





	}


