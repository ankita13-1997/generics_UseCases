package generics;

import java.util.Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[]     a1= {1,2,3,4,5};
		 float[]   b1= {1f,1f,3f,9f};
	     double[]  d1= {1.1,1.2,1.3,1.4,3.8};
	     String[]  s1= { "Zyx","Qwert","Cvrge","Ankita876"};
	     
	     System.out.println("your array is of a1 of type integer : ");
	     //print array a1
	     for(int i=0 ; i<a1.length ; i++) {
	    	
	    	 System.out.print(a1[i]+ " ");
	     }
	     
	     System.out.println();
	     System.out.println("your array is of b1 type float : ");
	     //print array b1
	     for(int i=1 ; i<b1.length ; i++) {
	    	
	    	 System.out.print(b1[i]+ "  ");
	     }
	     
	     System.out.println();
	     System.out.println("your array is d1 of type double : ");
	     //print array d1
	     for(int i=1 ; i<d1.length ; i++) {
	    	
	    	 System.out.print(d1[i]+ "  ");
	     }
	     
	     System.out.println();
	     System.out.println("your array is d1 of type double : ");
	     //print array s1
	     for(int i=1 ; i<s1.length ; i++) {
	    	
	    	 System.out.print(s1[i]+ "  ");
	     }
	     System.out.println();
         System.out.println("**************************************************************************************************************");

         //for finding the max value in array a1
         int max=0;
         for(int i=0 ;i<a1.length; i++)
         {
        	 if(a1[i]>max) {
        		 max=a1[i];
        	 }
         }
         System.out.println("maximum element in array a1 "+max);
	    

	
	    //for finding the max value in array b1
       float max1=0f;
       for(int i=0 ;i<b1.length; i++)
         {
   	        if(b1[i]>max1) {
   		       max1=b1[i];
   	      }
         }
        System.out.println("maximum element in array b1 "+max1);
        
        double max3=0.0;
        
        

        for(int i=0 ;i<d1.length; i++)
          {
    	        if(d1[i]>max1) {
    		       max3=d1[i];
    	      }
          }
         System.out.println("maximum element in array b1 "+max1);
         
         int max5 = 0;
         String maxs=s1[0];
         
         
       int stringlength=s1[0].length();
   	  for(int i=0 ;i<s1.length; i++)
             {
   	        if(s1[i].length() > stringlength) {
   		       max5=i;
   		       stringlength=s1[i].length();
   		       maxs=s1[i];
   	      }
         }
       
   	  System.out.println("maximum element in array s1 "+maxs+ " whose length is "+stringlength+ " unit");
   	  
   	  
    }
     
   

}

