package PracticeSet1;

public class peakFinder {
	public static void main(String[] args) {
		int[] a = {25,33,50,67,79,19,48,111,20};
		int i , n = a.length ; 
		
		for (i=1;i<n;i++) {
			if (a[i]>=a[i-1] && a[i]>=a[i+1]) {
				System.out.println("peak number :"+ a[i]);
			}
			
		}
		if (a[n]>=a[n-1]) {
			System.out.println("peak number :"+ a[n]);
		}
		
			
			
		
		
	}
	
	

}
