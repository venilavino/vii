import java.util.*;
public class CKPL_18_Maximum_jump
{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int n;
    n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;i++)
    {
      ar[i]=sc.nextInt();
    }
    int i=1;
    while(i<n-1)
    {
     int p=ar[i];
     if(ar[i]==0)
      {break;}
     i+=p;
    }
    if(i==n-1)
      System.out.println("true");
    else
      System.out.println("false");
   }
}
