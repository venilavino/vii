import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s= new Scanner (System.in);
	     int R1=s.nextInt(),R2=s.nextInt(),j,flag=1,cont=0;
	     for(int i=R1;i<=R2;i++)
	     {
	    	 flag=1;
	    	 j=2;
	    	 while(j<=i/2)
	    	 {
	    		 if(i%j==0)
	    		 {
	    			 flag=0;
	    			 break;
	    		 }
	    		 
	    		 j++;
	    	 }
	    	 
	    	 if(flag!=0)
	    	 {
	    		 cont++;
	    	 }
	    	 
	     }
	     
	     System.out.println(cont);
		s.close();
	}

}
