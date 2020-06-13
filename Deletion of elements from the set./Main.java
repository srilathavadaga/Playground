import java.io.*;
import java.util.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
     
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        TreeSet list=new TreeSet();
      
      String s=br.readLine();
      String[] arr=s.split(",");
      
      for(int i=0;i<arr.length;i++){
      list.add(arr[i]);
      }
      System.out.println(list);
      
     Object arr1[]=list.toArray();
      int n=arr1.length-1;
      
      while(list.isEmpty()==false){
      Object o=arr1[n];
        list.remove(o);
            System.out.println(list);
        n--;
        
        
      }
      }
}
