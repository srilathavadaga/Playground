import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
    
      LinkedHashSet list=new LinkedHashSet();
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      String data=br.readLine();
      String[] arr=data.split(",");
      
      for(int i=0;i<arr.length;i++){
        list.add(arr[i]);
      }
      
      System.out.println(list);
      
      
      
      
    }
}