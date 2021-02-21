package generics;

import java.util.ArrayList;

public class Practice1 {
	
	 public static <T extends Comparable<T>> void findmax(T[] element)
     {
    	 T max = element[0];
    	 for(T i : element) {
    		 if(i.compareTo(max) > 0) 
    		 {
    			 max=i;
    		 }
    	 }
    	 System.out.println("the maximum value in array is "+max);
    	 
     }
	 
	 public static <T extends Comparable<T>> void findmaxString(T[] element)
     {
    	 T max = element[0];
    	 int mxLength=element[0].toString().length();
    	 for(T i : element) {
    		 if(i.compareTo(max) > mxLength) 
    		 {
    			 max=i;
    			 mxLength=((String) element[(int) i]).length();
    		 }
    	 }
    	 System.out.println(mxLength);
    	 System.out.println("the maximum value in array is "+max);
    	 
     }

	 public static <E> void printArray(E[] element )
	 {
		for(E i :element)
		 {
			 System.out.println(i+ " ");
			 System.out.println();
		 }
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Integer[] a1= {1,4,5,3,9,2};
		 Float[]   b1= {0f,1f,3f,9f,2f};
	     Double[]  d1= {1.1,1.2,1.3,0.8,2.4,1.0};
	     String[]  s1= {"Ankita","pranil","cv","kitaparhikrishna"};
	   
	    
	    printArray(a1);
	    printArray(d1);
	    printArray(b1);
	    printArray(s1);
	    
	    
	   findmax(a1);
	   findmax(b1);
	   findmax(d1);
	   findmaxString(s1);
	   
       
	}

}
