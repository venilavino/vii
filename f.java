import java.io.IOException;
import java.util.Scanner;

public class Stringrev 
{

	public static void main(String args[])throws IOException
	{
		Scanner sc = new Scanner(System.in);
	String str=sc.nextLine();
	for(int ctr=0;ctr<str.length();ctr++)
	{
       System.out.print(""+(int)str.charAt(ctr));		
	}
}
