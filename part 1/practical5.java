import java.util.Scanner;

public class practical5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1:motor \n2:fan\n3:tube\n4:wire\n5:other\nenter choice: ");
        int choice=sc.nextInt();
        float price=100;
        switch(choice){
             case 1:
                price=price+((price/100)*8);

                System.out.println("price of motor is:"+price);
                break;
             case 2:
                price=price+((price/100)*12);

                System.out.println("price of fan is:"+price);
                break;
             case 3:
                price=price+((price/100)*5);

                System.out.println("price of tube is:"+price);
                break;
             case 4:
                price=price+((price/10)*75);

                System.out.println("price of wire is:"+price);
                break;
             case 5:
                price=price+((price/100)*3);

                System.out.println("price  is:"+price);
                break;
 
};
           
    }
}
