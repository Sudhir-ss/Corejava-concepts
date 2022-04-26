package loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		 
		//for(int i=0; i<=100;i = i+1)
			//System.out.println("hello world" + i);
	//for(int i=0; i<=100;i=i+2)
		//System.out.println( i);
   //   int  sum=0;
     // int n = 500;
      //for (int i =1; i<=n;i++)
    	//  sum = sum+i;
    	  //System.out.println(sum);
	
		//int tableof = 10;
		//for(int i=1;i<=10;i++)
		//		System.out.println(tableof* i);
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int factorial = 1;
		for(int i=n;i>=1;i--)
		{
			factorial = factorial*i;
		}
			System.out.println(factorial);
		
		
	}

}
