package cd;
import java.util.*;
public class Bull {
public static Scanner input=new Scanner (System.in);
public static String number (){
int x; char c; String s="";
while (s.length()<4) {
	x=(int)(Math.random()*10);
	c=(char)('0' + x);
 s+=""+ c;
}
return s;
}
	public static void main(String[] args) {
		String s3="";String s2="";String s=""; char c; char g; int count=0;
		System.out.println(number());
		while (s3!=number()&&count<10) {
			s2="";
			System.out.println("enter your guess");
			s=input.next();
			count++;
			for (int i=0;i<number().length();i++) {
				g=number().charAt(i);
				for(int j=0;j<number().length();j++) {
			c=s.charAt(j);
					if (g==c) {
					s3+=c;
					if (i==j) {
					s2+='*';
					}
					else if (i!=j){
						s2+='o';
					}
					
					}
					if (g!=c) {
						s2+=" ";
					}
			}
			}
			
			System.out.println(s2);
		
		}
	}
}