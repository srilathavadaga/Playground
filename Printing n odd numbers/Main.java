import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int count = 1; count <= 2*n; count = count+1){
        if(count%2 == 1){
          System.out.println(count);
        }
        count = count+1;
          
      }  
	}
}