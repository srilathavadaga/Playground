import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      System.out.print(fun(n));
    }
  
  public static int fun(int n){
    
    int sum  = 0;
    for(int i = 1; i <= n; i++){
      sum = sum+i;
    }
    return sum;
  }
}
