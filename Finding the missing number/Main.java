import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      int miss = 0;
      for(int j = 1; j <= n; j++)
      {
        boolean found = false;
        for(int i = 0; i < n; i++)
        {
        if(arr[i] == j)
        {
          found = true;
          break;
        // Type your code here
    }
}
      if(found == false)
      {
        miss = j; 
        break;
      }
    }
  System.out.print(miss);
}
}