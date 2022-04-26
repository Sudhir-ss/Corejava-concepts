package sets;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		
		int a[] = {4,-10,5,7,-2,4,};
		boolean found = false;
		
		for(int i =0; i <a.length;i++) {
			int sum =0;
			for(int j = i; j <a.length;j++) {
				sum += a[j];
				if(sum==0) {
					found = true;
					break;
				}
			}
			if(found)
				break;
		}
		System.out.println(found);

	}

}
