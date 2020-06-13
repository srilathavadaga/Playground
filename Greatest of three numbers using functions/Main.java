import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
  int n1 = in.nextInt();
    int n2 = in.nextInt();
  int n3 = in.nextInt();
    int result = greatest(n1, n2);
      System.out.println(greatest(result,n3));
	}
  public static int greatest(int a, int b)
  {
    int max = 0;
  {
    if(a > b)
    {
      max = a;
}
    else
    {
      max = b;
    }
    return max;
  }
}
}