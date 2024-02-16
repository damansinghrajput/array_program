package test.com;

public class ReverseNumber {
	
	int[] array;
	
	ReverseNumber(int[] array){
		this.array = array;
	}

	
	public void reverseNumber() {
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print( array[i] +" ");
		}
		
		
	}
	
	
	
	public void cubic() {
		for(int i=0; i<array.length;i++) {
			
			System.out.println( array[i]*array[i]*array[i] +"");
		}
		
	}
	
	
	public static void main(String[] args) {
	 int[] array = {10,20,30,50};
	 ReverseNumber run = new ReverseNumber(array);
      run.reverseNumber();
      run.cubic();
	}

}
