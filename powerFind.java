import java.util.*;

import java.math.*;
public class powerFind {
    public static BigInteger  findPower(BigInteger a,int b) {
    	BigInteger  result;
    	BigInteger finalResult;
    	
    	if(b==1) {
    		return a;
    	}
    	else {
    		
    		 result=findPower(a,b/2);
    		 finalResult=result.multiply(result);
    		 
    		 if(b%2==0) {
    			 return finalResult;
    		 }
    		 else {
    			 finalResult=a.multiply(finalResult);
    		 }
    	}
    	return finalResult;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a and b:-");
        BigInteger a = sc.nextBigInteger();
        int b = sc.nextInt();

        BigInteger result = findPower(a, b);

        System.out.println("The power of a^b:-" + result);
    }
}