package test.com;
public class BiArray {

    private int[] array1;
    private int[] array2;

    public BiArray(int[] array1, int[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    public boolean areSumsEqual() {
          boolean returnvalue = false;
        int sum1 = calculateSum(array1);
        int sum2 = calculateSum(array2);
         if(sum1==sum2 ){
        	
        	 
        	 returnvalue= true;
         }
             
        return returnvalue;
        
    }

    private int calculateSum(int[] array) {
      int sum = 0;
       for (int total:array)
       sum+=total;
       return sum;
    }
  

public static void main(String[] args) {
	int[] array1 = {1,2,3,4};
	int[] array2 = {4,3,2,1};
	BiArray run = new BiArray(array1,array2);
	
    System.out.println(run.areSumsEqual());
}
}