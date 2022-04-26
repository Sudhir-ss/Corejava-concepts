package array;



public class LargestArray {

	public static void main(String[] args) {
	   
		System.out.println("enter the elements of the array");
		
		int arr[] = {25,11,45,32,56};
		
		 int max = arr[0];
		 for (int i =0; i<arr.length;i++) {
			 if(arr[i]>max) {
				 max = arr[i];
			 }
			
		 }
		  System.out.println("largest of the array is "+max);
		

	}

}
