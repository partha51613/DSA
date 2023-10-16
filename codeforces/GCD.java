/**
 * 
 * https://www.codingninjas.com/studio/problems/gcd_6557 
 * GCD or HCF
 * 
 * 
 * */ 

//Optimal







//Brute Force
public class GCD {
    public static void main(String[] args) {
        int a=24;
        int b=12;
        System.out.println(gcd(a, b));
    }
    public static int gcd(int a,int b)
	{
		// Write your code here
		int maxLimit = Math.min(a,b);

		for(int i=maxLimit;i>=0;i--){
			if(a%i==0 && b%i==0){
				maxLimit = i;
				break;
			}
		}
		return maxLimit;
		
	}		
}
