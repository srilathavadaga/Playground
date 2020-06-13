import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        arr[i] = in.nextInt();
      }
      int sum = in.nextInt();
      func(n,arr,sum);
    }
  public static void func(int n1,int arr1[],int sum1)
  {
    for(int i = 0; i < n1; i++)
    {
         for(int j = i+1; j < n1; j++)
         {
           int sum11 = arr1[i]+arr1[j];
           if(sum11 == sum1)
           {
             System.out.println(arr1[i]+", " +arr1[j]);
           }
         }
    }
}
  }