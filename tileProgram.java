
public class tileProgram {
  public static int getWays(int n) {
	  
	  // base case condition
	  if(n<=3) {
		  return n;
	  }
	  
	  // recursive call
	  return getWays(n-1)+getWays(n-2);
  }
  
  public static void main(String []args) {
	  System.out.println("for n=1,total ways:" +getWays(1));
  }
}
