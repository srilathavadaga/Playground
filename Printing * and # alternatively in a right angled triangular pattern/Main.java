import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
int n = in.nextInt();
      int count = 0;
      for(int i = 1; i <= n; i++){
        for(int j = 1; j <= i; j++){
          if(count==0){
            System.out.print("*");
            count= 1;
    }
          else{
            System.out.print("#");
            count=0;
}
        }
        System.out.println();
      }
    }
}