import java.lang.Math;
import java.util.Scanner;
public class Line_comparision_pb1 {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the values of x1,x2,y1,y2:");
    int x1=sc.nextInt();
    int x2=sc.nextInt();
    int y1=sc.nextInt();
    int y2=sc.nextInt();
    double length=Math.sqrt((x2-x1)^2+(y2-y1)^2);
    System.out.println(length);


}
}
