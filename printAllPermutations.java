
public class printAllPermutations {
	
	public static String swap(String str,int i,int j) {
		char temp;
		char[]charArray=str.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		
		return String.valueOf(charArray);
	}
    public static void permute(String str,int l,int r) {
/* 
 str-input string
 l-starting index
 r-ending index   
 */ 
    if(l==r) {	
    	System.out.println(str);
    }
    else {
    	for(int i=l;i<=r;i++) {
    		str=swap(str,l,i);
    		permute(str,l+1,r);
    		
    		// backtracking
    		str=swap(str,l,i);
    	}
     }
    	
   }
	
	
	
	public static void main(String []args) {
	
	String str1="xy"	;
	int n=str1.length();
	System.out.println("permutation for string :" + str1 + " are : ");
	permute(str1,0,n-1);
	
	System.out.println();
	
	String str2="ABC"	;
	int m=str2.length();
	System.out.println("permutation for string :" + str2 + " are : ");
	permute(str2,0,m-1);
	}
}
