package test.com;


//Input: s = "abc", t = "ahbgdc"
//Output: true
//Example 2:
//
//Input: s = "axc", t = "ahbgdc"
//Output: false
 
public class StringMatch {
	
	
  public boolean isSubsequence(String s, String t) {
	  boolean match = false;
	  
	 
		  
	  
	  for(int i=0; i<s.length();i++) {
		  
	  if(s.charAt(i)==t.charAt(i+1)) {
		  match=true;
		
		  
	  }
	  }
        return match;
    }

	public static void main(String[] args) {
		StringMatch run = new StringMatch();
		System.out.println(run.isSubsequence("abc","abcfedf"));

	}

}
