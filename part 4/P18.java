import java.util.*;
public class P18 {
    static String name;
    static int age;
    static long number;
    static String address;
    static int salary;
    static String dep;
    static  String special;
    static int i;
    

     static Scanner s= new Scanner(System.in);
    public static void getdata(){
        System.out.print("Enter the name:");
        s.nextLine();
        name=s.nextLine();
        System.out.print("Enter the age:");
        age=s.nextInt();
        System.out.print("Enter the phone number:");
        number=s.nextLong();
        System.out.print("Enter the home Address:");
        s.nextLine();
        address=s.nextLine();
        System.out.print("Enter the salary:");
        salary=s.nextInt();
    }
    static void printSalary(){
              System.out.println("salary:"+salary);  
    }
    public static void setdata(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("phone number:"+number);
        System.out.println("home Address:"+address);
        printSalary();
        if(i==1){
            System.out.println("specialization:"+special);
        }
        else{
        System.out.println("department:"+dep);
    }
}

    public static void main(String args[]){
       
        System.out.println("Enter the 1 for Employee.");
        System.out.println("Enter the 2 for Manager.");
        System.out.print("enter your choice:");
        i=s.nextInt();
        switch(i){
            case 1:
            employee e=new employee();
            e.specialization();
            System.out.println("------------ Employee.------------");
            e.setdata();
            break;
            case 2:
            Manager m=new Manager();
             m.department();
             System.out.println("----------- Manager.-------------");
             m.setdata();
        }
           s.close();
    }
    
}
class employee extends P18{
     void specialization(){
        getdata();
        System.out.print("Enter the specialization:");
        s.nextLine();
        special=s.nextLine();

     }
}
class Manager extends P18{
 void department(){
    getdata();
    System.out.print("Enter the department:");
    s.nextLine();
    dep=s.nextLine();
 }
}
