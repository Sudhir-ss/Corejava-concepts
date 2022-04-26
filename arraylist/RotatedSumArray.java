package arraylist;

public class RotatedSumArray {
	
	boolean SumArray(int arr[] , int n,int sum) {
	
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-1; j++) {
				if(arr[i]+arr[j]==sum) {
					return true;
					
				}
			}
			
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8};
		int sum = 11;
//		int n;
		
		RotatedSumArray ra = new RotatedSumArray();
		ra.SumArray(arr, 8, sum);
		
		
	}

}
