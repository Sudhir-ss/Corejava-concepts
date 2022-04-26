package conditionalstatement;

public class NestedIfElse {

	public static void main(String[] args) {
		 
		int a=44 ;
		int b=82;
		int c=92;
		 
		int result=0;
//		 if(a>b) {
//			 if(a>c) {
//				 result=a;
//			 }else {  
//				 result =c;
//			 }
//		 }else {
//		    if(b>c) {
//			 result =b;
//		 }else {
//			 result =c;
//		 }
//	 }
//			 
      result = a>b ? a>c ? a:c : b>c ? b: c;
	
	 System.out.println("the largest number is " + result);
	}

}
