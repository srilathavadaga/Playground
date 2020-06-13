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
  public static void func(int array1[] , int n1)
  {
    int max = 0;
   if(array1[0] > array1[1])
   {
    max = 0;
   }
    else
    {
      max = 1;
    }
    for(int j = 2; j <= (n1-1); j++)
    {
      if(array1[j] > array1[max])
      {
       max = j;
      }
    }
      System.out.print(max);
    }
  }