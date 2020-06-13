import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
      Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
  int n2 = in.nextInt();
  int n3 = in.nextInt();
      int result = gcd(n1,n2);
      System.out.println(gcd(n3,result));
    }
  public static int gcd(int a,int b)
  {
    int min = 0;
    if(a < b)
    {
      min = a;
    }
    else
    {
      min = b; 
    }
    while(min >= 1)
    {
      if((a%min==0)&&(b%min==0))
      {
        return min;
      }
      --min;
    }
    return 0;
  }
    
	    // Type your code here
	}
