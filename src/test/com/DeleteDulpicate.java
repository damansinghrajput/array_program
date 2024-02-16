package test.com;

public class DeleteDulpicate {
	

	int[] array;
	
	DeleteDulpicate(int[] array){
		this.array = array;
	} 
	
	public void delete() {
		for(int i=0 ; i<array.length;i++) {
			
			for(int j=array.length-1;j>=0;j--) {
				
				if(i!=j) {
					
					if(array[i]==array[j]) {
						
						System.out.println(array[i]);
						
					}
				}
			
				
			}
			
			
		}
		}
	

	public static void main(String[] args) {
		 
			int[] array = {12,20,10,10,30};
			
			DeleteDulpicate run = new DeleteDulpicate(array);
			run.delete();
			
		}

	

}
