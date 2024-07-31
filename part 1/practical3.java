import java.util.Scanner;
public class practical3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("distance in meters:");
        int dist=sc.nextInt();
        System.out.println("time: \n hour:");
        int hr=sc.nextInt();
        System.out.println("minutes:");
        int min=sc.nextInt();
        System.out.println("seconds:");
        int sec=sc.nextInt();
        float km=dist/1000;
        float mile=dist/1609;
        float time_hour=hr+(min/60)+(sec/3600);
        float time_sec=(hr*3600)+(min*60)+sec;
        float speed_ms=dist/time_sec;
        float speed_kh=km/time_hour;
        float speed_mh=mile/time_hour;
        System.out.println("speed kilometer per hour:"+speed_kh);
        System.out.println("speed miles per hour:"+speed_mh);
        System.out.println("speed meter per second:"+speed_ms);




    }
}
