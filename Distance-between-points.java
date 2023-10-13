import java.util.Scanner;
class Distance-between-points{
    public static void main(String [] args){
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter co-ordinate x1 =");
        int x1=scr.nextInt();
        System.out.println("Enter co-ordinate x2=");
        int x2=scr.nextInt();
        System.out.println("Enter co-ordinate y1 =");
        int y1=scr.nextInt();
        System.out.println("Enter co-ordinate y2 =");
        int y2=scr.nextInt();
       
       int x=(x2-x1)*(x2-x1);
       int y=(y2-y1)*(y2-y1);
       int sum=x+y;
       
       System.out.println("Distance between co-ordinates ="+Math.sqrt(sum));
    }
}