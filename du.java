import java.util.Scanner;


public class ply31 {
public static void main(String  g[]){
	String s;
	Scanner abc=new Scanner(System.in);
	s=abc.next();
	int count1=0,count2=0,count3=0;;
char c;
for(int i=0;i<s.length();i++){
	c=s.charAt(i);
	if(c==28){
		count1++;
	}
	else if(c==29){
		count2++;
		
	}
	if(count1==count2){
		count3++;
	}
}System.out.println(count3);


}
}
