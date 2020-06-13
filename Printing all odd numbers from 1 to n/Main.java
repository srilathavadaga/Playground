import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i = 1; i <= n; i = i++){
        if( i%2 == 1)
        {
          System.out.println(i);
        }
        i = i+1;
      }
	}
}