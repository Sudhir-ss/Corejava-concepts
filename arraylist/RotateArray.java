package arraylist;

public class RotateArray {
	
	void rotateArray(int arr[] , int d ,int n) {
		for(int i = 0; i<d; i++) {
		 rotateArrayByOne(arr,n);
			
		}
	}
	
	void rotateArrayByOne(int arr[] , int n) {
		int temp = arr[0];
		for(int i = 0; i<n-1; i++) {
			arr[i]= arr[i+1];
			
		}
		arr[n-1] = temp;
		
	}
	
	void print( int arr[], int n) {
		for(int i = 0; i<n; i++) {
			System.out.println(arr[i] );
		}
	}

	public static void main(String[] args) {
		int d = 2;
		int arr[] = {1,2,3,4,5,6,7,8};
		RotateArray rt = new RotateArray();
		rt.rotateArray(arr, 2, 8);
		rt.print(arr, 8);
	}

}
