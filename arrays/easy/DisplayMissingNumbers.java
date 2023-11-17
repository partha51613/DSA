import java.util.Scanner;

public class DisplayMissingNumbers {
    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
        // System.out.println("Enter size");
		n = sc.nextInt();

		int[] arr = new int[n];
		int max=0;     
         System.out.println("Enter Elements");
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();5
		}

		//Find the max number
		for(int i=0;i<n;i++){
			max = Math.max(max,arr[i]);
		}

		
		int[] countStore = new int[max+1];
		
		for(int i=0;i<n;i++){
			countStore[arr[i]]++;
		}

        // System.out.println("Output: ");
		for(int i=1;i<max+1;i++){
			if(countStore[i]==0){
				System.out.println(i + "is appearing " +countStore[i] +" times");
			}
		}
		sc.close();

	}
}
