import java.util.*;
public class practical7{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		System.out.println("enter number:");
		int a=s.nextInt();
		for(int i=0;i<a;i++){
            if(str.length()>3){
		System.out.print(str.substring(0,3));
            }
            else{
                    System.out.print(str);
			}
		}
	}
}

		
		
		
