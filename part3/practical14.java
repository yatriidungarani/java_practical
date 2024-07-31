import java.util.Scanner;
class date{
	int d,m,y;
	date(int da,int month,int year){
		d=da;
		m=month;
		y=year;
	}
	Scanner s =new Scanner(System.in);
	void set_d(){
		d=s.nextInt();
	}
	void set_mm(){
		m=s.nextInt();
	}
	void set_y(){
		y=s.nextInt();
	}
	void display(){
		System.out.println(d+"/"+m+"/"+y);
	}
}
public class practical14{
	public static void main(String[] args){
		date d1=new date(4,11,2024);
		date d2=new date();
		d1.set_d();
		d1.set_mm();
		d1.set_y();
		d1.display();
		
	}
}
