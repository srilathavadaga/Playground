import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner la = new Scanner(System.in);
    int num = la.nextInt();
    int f = num/100;
    int s = ((num/10)%10);
    int l = num%10;
    int r = (l*100+s*10+f);
    System.out.println(r);
    
    //Type your code here
  }
}