import java.util.Scanner;
class Main{
    public static void main(String args[]){
Scanner in = new Scanner(System.in);
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        for(int i = 0; i <= arr_size-1; i++)
        {
            arr[i] = in.nextInt();
        }
          int max_no = 0;
          if(arr[0]>arr[1])
          {
            max_no = arr[0];
          }
      else
      {
        max_no = arr[1];
      }
      for(int i = 2; i <= arr_size-1;i++)
      {
        if(max_no < arr[i])
        {
          max_no = arr[i];
        }
      }
      System.out.println(max_no);
        }
    }
