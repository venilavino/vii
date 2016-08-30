import java.util.*;
import java.lang.*;
import java.io.*;

class Reverse_me
{
	public static void main (String[] args) throws java.lang.Exception
	{
       String input="";
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine();
            String str="";
            String strNew="";
            char[] try1= input.toCharArray();
            for (int i=try1.length-1;i>=0;i--)
             {
                System.out.print(try1[i]);
                str=str+try1[i];
             }
             System.out.println();
             strNew = str.replaceAll("[aeiouAEIOU]", "");
                  System.out.print(strNew);
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
}}
