import java.util.*;

public class LeapYear
{
    public static void main(String args[])
    {
       int yer;
       Scanner scan = new Scanner(System.in);
     
       System.out.print("Enter Year : ");
       yer = scan.nextInt();
     
       if((yer%4 == 0) && (yer%100!=0))
       {
           System.out.print("This is a Leap Year");
       }
       else if(yer%100 == 0)
       {
           System.out.print("This is not a Leap Year");
       }
       else if(yer%400 == 0)
       {
           System.out.print("This is a Leap Year");
       }
       else
       {
           System.out.print("This is not a Leap Year");
       }
    }
}
