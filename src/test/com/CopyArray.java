package test.com;

//Write a program to copy the elements of one array into another array

public class CopyArray {

	

	int[] array;
	
	CopyArray(int[] array){
		this.array = array;
	} 
	
	
	public void copyArr() {
		for(int i=0; i<array.length;i++) {
			
			
			System.out.println(array[i]);
			
			
		}
		
		int [] c =new int[array.length];
		
	for(int i=0; i<array.length;i++) {
		
				
				
				
        c [i] = array[i]; 
			
			System.out.println(c[i]);
			
			
		}
		
	}
		
			
			
		
	
	public static void main(String[] args) {
		int[] array = {10,20,30,50};
		
		CopyArray run = new CopyArray(array);
		run.copyArr();
		
	}

}
