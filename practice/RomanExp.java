package practice;

import java.util.Scanner;

public class RomanExp {
	
	 static String romanExp(int  num) {
		 StringBuilder br = new StringBuilder("");
		 while(num != 0) {
			 while(num == 500) {
				 br.append("D");
				 num -= 500;
			 }
			 while(num >= 400) {
				 br.append("CD");
				 num -= 400;
			 }
			 while(num >= 100) {
				 br.append("C");
				 num -= 100;
			 }
			 while(num >= 90) {
				 br.append("XC");
				 num -= 90;
			 }
			 while(num >= 50) {
				 br.append("L");
				 num -= 50;
			 }
			 while(num >= 40) {
				 br.append("XL");
				 num -= 40;
			 }
			 while(num >= 10) {
				 br.append("X");
				 num -= 10;
			 }
			 while(num >= 9) {
				 br.append("IX");
				 num -= 9;
			 }
			 while(num >= 5) {
				 br.append("V");
				 num -= 5;
			 }
			 while(num == 4) {
				 br.append("IV");
				 num -= 4;
			 }
			 while(num == 1) {
				 br.append("I");
				 num -= 1;
			 }
		 }
		 return br.toString();
	 }
	 
	 public static void main(String[] args) {
		
		
		 System.out.println("enter the number to change into the Roman Expression "+romanExp(255));
		 
	 }
	
}
 