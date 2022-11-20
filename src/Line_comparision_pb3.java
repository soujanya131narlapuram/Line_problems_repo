public class Line_comparision_pb3 {
    public  static String line_len(int x1, int x2, int y1, int y2)
    {
        double l1=Math.pow((x2-x1),2);;
        double l2=Math.pow((y2-y1),2);
        double len1=Math.sqrt(l1+l2);
        String s1 = String.valueOf(len1);
//        System.out.println(s1);
        return s1;
    }
    public static void main(String[] args){
//    Scanner sc=new Scanner(System.in);
    String line1=line_len(4,6,6,8);
    String line2=line_len(6,4,8,6);
    System.out.println(line1.compareTo(line2));


    }
}

