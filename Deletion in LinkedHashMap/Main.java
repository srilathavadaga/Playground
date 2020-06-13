import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
      System.out.print("Enter the number of values to be inserted in map:");
      int n=Integer.parseInt(br.readLine());
      System.out.println(n);
      
      for(int i=0;i<n;i++){
      hm.put(br.readLine(),br.readLine());
      }
      
       System.out.println(hm);
      
       System.out.print("Enter the index to be removed:");
      	String idx=br.readLine();
     	 hm.remove(idx);
       System.out.println(idx);
      
      System.out.println(hm);
       System.out.println("Size of map is : "+hm.size());
      
      
    }
}