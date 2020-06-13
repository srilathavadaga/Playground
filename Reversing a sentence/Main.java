import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      StringBuilder sb = new StringBuilder(str);
      int length = sb.length();
      reverse_string(sb,0,length-1);
        // Type your code here
      int start_idx = 0;
      for(int idx = 0; idx < length; idx++)
      {
        if(sb.charAt(idx) == ' ')
        {
          reverse_string(sb,start_idx,idx-1);
          start_idx = idx+1;
        }
        else if(idx == (length-1))
                {
                  reverse_string(sb,start_idx,idx);
                  start_idx = idx+1;
                }
      }  
    System.out.print(sb);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
       int end = end_idx;
      int front = start_idx;
      while(front < end)
      {
        char tmp_ch = sb.charAt(front);
        sb.setCharAt(front,sb.charAt(end));
        sb.setCharAt(end,tmp_ch);
        front++;
        end--;
    }
}
           }