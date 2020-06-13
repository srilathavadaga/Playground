import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
			ArrayList list=new ArrayList();
			boolean flag=true;
	      while(flag){
	        System.out.println("Choose any one:");
	            System.out.println("1.Insert");
	            System.out.println("2.delete");
	            System.out.println("3.Display");
	            System.out.println("4.Exit");
	        int opt=Integer.parseInt(br.readLine());
	        
	        switch(opt){
	        case 1: String data=br.readLine();
	        		String[] arr=data.split(",");
	        		
	        		for(int i=0;i<arr.length;i++) {
	        			list.add(arr[i]);
	        		}
	        		break;
	        		
	        case 2: System.out.print("Enter the index value to be deleted:");
	        		int del=Integer.parseInt(br.readLine());
                	System.out.println(del);
	        		list.remove(del);
	        		break;
	        		
	        case 3:System.out.println(list);
	        		break;
	        		
	        case 4:flag=false;
	        		break;
	        	
	        }  
	      }	
    }
}