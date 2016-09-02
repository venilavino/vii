
import java.util.*;
public class longest
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
int n,j;
n=sc.nextInt();
String av[]=new String[100];
for(int i=0;i<n;i++)
{
av[i]=sc.nextLine();
}
String long,check;
if(av.length>0)
long=av[0];
for(int i=1;i<av.length;i++)
{
check=av[i];
for(j=0;j<Math.min(long.length(),av[i].length());j++)
{
if(long.charAt(j)!=check.charAt(j))
break;
}
long=av[i].subString(0,j);
}
System.out.println("longest prefix is:"+long);
}
}
