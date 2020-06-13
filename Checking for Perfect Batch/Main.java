import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int array[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      array[i] = in.nextInt();
    }
    func(array , n);
  }
  public static void func(int arr1[] , int n1)
  {
    int mainsum = 0; 
    int batch = 0;
    for(int j = 0; j <= 2; j++)
    {
      mainsum = arr1[0]+arr1[1]+arr1[2];
    }
    for(int k = 3; k < n1; k = k+3)
    {
      batch = arr1[k]+arr1[k+1]+arr1[k+2];
    }
    if(mainsum==batch)
    {
      System.out.print("Perfect Batch");
    }
    else
    {
      System.out.print("Not a Perfect Batch");
    }
    //Try your code here
  }
}