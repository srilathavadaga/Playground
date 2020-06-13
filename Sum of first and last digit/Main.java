import java.util.Scanner;
class Main {
	public static void main (String[] args){
Scanner in = new Scanner(System.in);
      int  n = in.nextInt();
      int sum = 0;
      int last_digit = n%10;
      while(n>=10)
      {
        n = n/10;
      }
      sum = last_digit+n;
      System.out.println(sum);
    }
}