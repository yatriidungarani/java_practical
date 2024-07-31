import java.util.*;
public class practical8{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int[] arr= new int[5];
		int count=0;
		for(int i=0;i<5;i++){
			arr[i]=s.nextInt();
		}
	    for(int i=0;i<5;i++){
			if(arr[i]==9)
				count++;
		}
		System.out.println("number of 9's in array are:"+count);
	}
}
