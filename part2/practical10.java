import java.util.*;
public class practical10{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("Length:"+str.length());
		System.out.println("Lowecase:"+str.toLowerCase());
		System.out.println("Uppercase:"+str.toUpperCase());
		System.out.println("Reverse:");
		char x;
		for(int i=0;i<str.length();i++){
			x=str.charAt(i);
			
			System.out.print(x);
			
			
		}
	    
	}
}
