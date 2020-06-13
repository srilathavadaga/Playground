import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int arr[] = new int[n];
      for(int idx = 0; idx < n; idx++)
      {
        arr[idx] = in.nextInt();
      }
      int freq[] = new int[k];
      for(int i = 0; i <= k-1; i++)
      {
        freq[i] = 0;
      }
      for(int i = 0; i < n; i++)
      {
        freq[arr[i]-1]++;
      }
      for(int idx = 0; idx <= k-1; idx++)
      {
        System.out.println((idx+1)+" "+freq[idx]);
    }
}
}