package test.com;

public class ArrayJoinOne {
	

	int[] array;
	int[] array1;
	 ArrayJoinOne(int[] array , int[]  array1){
		this.array = array;
		this.array1 = array1;
	} 
	
	
	public void addArray() {
		for(int i=0; i<array.length;i++) {
			
			
			System.out.println(array[i]);
			
			
		}
		
		
	for(int i=0; i<array1.length;i++) {
		
		System.out.println(array1[i]);	
			
		}
		
	}

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4};
		int[] array1 = {5,6,7,8};
		ArrayJoinOne run = new ArrayJoinOne(array,array1); 
run.addArray();
	}

}
