import java.util.Scanner;
class employee{
	String fs;
	String ls;
	double sal;
	employee(){}
	employee(String fn,String ln,double salary){
        fs=fn;
		ls=ln;
		sal=salary;
	};
	Scanner sc=new Scanner(System.in);
	void set_fs(){
		fs=sc.nextLine();
	}
	void set_ls(){
		ls=sc.nextLine();
	}
	void set_sal(){
		sal=sc.nextDouble();
		if(sal<0){
			sal=0.0;
		}
		else{
			sal=sal+sal*(10/100);
		}
	}
	String get_fs(){
		return fs;
	}
	String get_ls(){
		return ls;
	}
	double get_sal(){
		return sal;
	}
}
public class practical13{
	public static void main(String[] args){
		employee e1=new employee("abc","cde",25000);
		employee e2=new employee();
		
		//e1.set_fs();
	//	e1.set_ls();
	//	e1.set_sal();//
		System.out.println(e1.get_fs());
		System.out.println(e1.get_ls());
		System.out.println(e1.get_sal());
		
	}
}
