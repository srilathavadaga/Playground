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
      
      
      System.out.print("Enter the value to be deleted: ");
      String del=br.readLine();
       System.out.println(del);
      list.remove(del);
      
		System.out.println(list);
      
      System.out.print("Enter the value to be added: ");
       String add=br.readLine();
       System.out.println(add);
      list.add(add);
       System.out.print(list);
      
}}