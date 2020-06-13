import java.util.*;
import java.io.*;
import java.lang.*;

public class Main 
{
    public static void main(String a[])throws IOException
    {
      
      TreeMap<String,String> map=new TreeMap<String,String>();
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      System.out.print("Enter the number of values to be inserted in map:");
      int n=Integer.parseInt(br.readLine());
      System.out.println(n);
      
      for(int i=0;i<n;i++){
      map.put(br.readLine(),br.readLine());
      }
      
        System.out.println(map);
      
      System.out.print("Enter the index to be removed:");
      String idx=(br.readLine());
      System.out.println(idx);
      
      map.remove(idx);
       System.out.println(map);
      
      
       System.out.print("Enter the index to insert:");
      String idx1=(br.readLine());
      System.out.println(idx1);
      System.out.print("Enter the value to be inserted:");
      String val=(br.readLine());
      System.out.println(val);
      map.put(idx1,val);
      System.out.println(map);
    
      
      
    }
}