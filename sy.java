import java.util.Scanner;

public class findhcf 
{
  
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		int i1=in.nextInt();
		int i2=in.nextInt();
		int r = 0;
		
		while(r>0)
		{
			r=i1%i2;
			i1=i2;
			i2=r;
		}
     
		System.out.println("GCD IS"+i1);
	}

}
