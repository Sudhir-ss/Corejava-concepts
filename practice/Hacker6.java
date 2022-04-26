package practice;
 
import java.io.*;
import java.util.*;

public class Hacker6 {

	 public static void main(String[] args) {
	       
         Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); sc.nextLine();
       String[] sArray = new String[n];
       for(int i = 0;i<n;i++){
           sArray[i] = sc.nextLine(); 
       }
       for(int i=0;i<n;i++){
           char[] arr = sArray[i].toCharArray();
            for (int o=0; o<arr.length; o+=2){
                System.out.print(arr[o]);
            }
            System.out.print(" ");
            for(int r=1;r<arr.length;r+=2){
            System.out.print(arr[r]);
            }
            System.out.println();
       }
        
       
    }
}