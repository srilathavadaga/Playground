import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String s1 = in.nextLine();
      StringBuilder sb = new StringBuilder(s1);
      int l1 = sb.length();
      int freq[] = new int[70];
      for(int i = 0; i < 70; i++)
      {
        freq[i] = 0;
      }
      for(int j = 0; j < l1; j++)
      {
        if(sb.charAt(j) >= 'A' && sb.charAt(j) <= 'Z')
        {
          int offset = sb.charAt(j)-'A';
          char ch = (char)('a'+offset);
          sb.setCharAt(j,ch);
        }
         if(sb.charAt(j) >= 'a' && sb.charAt(j) <= 'z')
        {
         freq[sb.charAt(j)-'a']++;
         }
      }
      for(int i = 0; i < l1; i++)
      {
        if(freq[sb.charAt(i)-'a'] != 0)
        {
          System.out.print(sb.charAt(i)+""+freq[sb.charAt(i)-'a']+" ");
          freq[sb.charAt(i)-'a'] = 0;
        }
      }
    }
}