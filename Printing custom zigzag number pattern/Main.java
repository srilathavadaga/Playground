import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 1; i <= n; i++)
      {
        for(int j = 1; j <= n; j++)
        {
          if(((i%2==0)&&(j==1))||((i%2==1)&&(j==n)))
          {
            System.out.print(i+1);
          }
          else
          {
            System.out.print(i);
          }
        }
        System.out.println();
      }
    }
	}
