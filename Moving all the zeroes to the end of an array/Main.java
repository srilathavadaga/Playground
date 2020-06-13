import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int array[] = new int[n];
      for(int i = 0; i < n; i++)
      {
        array[i] = in.nextInt();
    }
      func(n,array);
      for(int j = 0; j < n; j++)
      {
        System.out.print(array[j] +" ");
      }
    }
  public static void func(int n1,int array1[])
  {
    int count = 0;
    for(int i = 0;i < n1; i++)
    {
      if(array1[i]!=0)
      {
        int temp = array1[i];
        array1[i] = array1[count];
        array1[count] = temp;
        count++;
      }
    }
  }
}