import java.lang.Math;
import java.util.Scanner;
//import java.util.Arrays;
public class Line_comparision_pb2 {
    public  static double line_len(int x1,int x2, int y1,int y2) {
        double l1=Math.pow((x2-x1),2);;
        double l2=Math.pow((y2-y1),2);
        //System.out.println(l1);
        //System.out.println(l2);
        double len1=Math.sqrt(l1+l2);
        //String len_s1 = String.valueOf(len1);
        System.out.println(len1);
        return len1;
    }
    public static void main(String[] args){
     int[] line_arr=new int[8];
     for(int line=0;line<2;line++) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the values for line" + (line+1));
         if (line==0) {
             line_arr[0] = sc.nextInt();
             line_arr[1] = sc.nextInt();
             line_arr[2] = sc.nextInt();
             line_arr[3] = sc.nextInt();
         } else{
             line_arr[4] = sc.nextInt();
             line_arr[5] = sc.nextInt();
             line_arr[6] = sc.nextInt();
             line_arr[7] = sc.nextInt();
         }
     }
     String s1=String.valueOf(line_len(line_arr[0],line_arr[1],line_arr[2],line_arr[3]));
     String s2=String.valueOf(line_len(line_arr[4],line_arr[5],line_arr[6],line_arr[7]));
    System.out.println(s1.equals(s2));
}
}
