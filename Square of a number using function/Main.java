import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(Square(n));
    }
  
  public static int Square(int n){
    int sqr = n*n;
    return sqr;
}
}