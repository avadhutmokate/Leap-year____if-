import java.util.Scanner;
class LeapYear1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year : ");
        int year = sc.nextInt();

        if
        ((year%100!=0 || year%400==0) && year%4==0)
        {
            System.out.println("year+ is a Leap year");
        }
        if
        (!((year%100!=0 || year%400==0) && year%4==0))
        {
        System.out.println(year+" is not a Leap year");
            
            

        }
        
    }
}