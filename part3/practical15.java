import java.util.*;
class rect{
	int l,b;
	rect(){}
	rect(int length,int bredth){
		l=length;
		b=bredth;
	}
	int returnarea(){
		return l*b;
	}
}
public class practical15{
	public static void main(String[] args){
		rect r1=new rect(3,7);
		rect r2=new rect();
		int a=r1.returnarea();
		System.out.println(a);
		System.out.println(r2.returnarea());
	}
}
