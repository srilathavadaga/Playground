import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      int count = 0,res = 1;
      while(count <exponent)
      {
        res = res*base;
        count++;
      }
       System.out.println(res); //Try your logic here
    }
}