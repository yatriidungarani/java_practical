import java.util.Scanner;

public class practical4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float[] arr=new float[5];
        float sum=0;
        for(int i=0;i<5;i++){
            System.out.println("expense on day"+(i+1));
            arr[i]=sc.nextFloat();

            sum=sum+arr[i];
        }
        System.out.println("total expense:"+sum);



    }
}
