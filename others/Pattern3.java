
/**
 * Pattern 3
 * 
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * 
 */


public class Pattern3 {
    public static void main(String[] args){
        
        int i=0;
        int j=0;
        int n=5;
        for(j=0;j<n;j++){
            for(i=n-j;i<n;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}






