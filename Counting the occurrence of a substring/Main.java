import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String str1 = in.nextLine();
    String str2 = in.nextLine();
    int length1 = str1.length();
        int length2 = str2.length();
int count = 0;
    for(int i = 0; i < (length1-length2+1); i++)
    {
      boolean is_matching = true;
      for(int j = 0; j < length2; j++)
      {
        if(str1.charAt(i+j)!=str2.charAt(j))
        {
          is_matching = false;
        }
      }
      if(is_matching == true)
      {
        count++;
      }
    }
    System.out.print(count);
  } 
}