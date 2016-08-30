import java.util.*;

public class ana 
{
    public static void main(String[] args) {
                int i,j,k=0,r,c,z = 0;
String s="but i will not listen to him known";
        String s2="water dropped into the silent tub nwokn";
        String[] m=s.split("\\s");
        String[] n=s2.split("\\s");
        char[] a=new char[100];
        char[] b=new char[100];
        int t1=m.length;
      
        int t2=n.length;
        int count=0;
        for(i=0;i<t1;i++){
           a=m[i].toCharArray();
           r=a.length;
           for(j=0;j<t2;j++){
               b=n[j].toCharArray();
               c=b.length;count=0;
               if(c==r){
               for(int p=0;p<r;p++){
               for(k=0;k<c;k++){
               if(a[p]==b[k]){
                 
               count=count+1;
               }
               
               

             
                     
               }               

                      }
                      z=z+count/r;
            

        } 
        
    }
        }
        System.out.println(""+z);
}
    }
        
                
}
