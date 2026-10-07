import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String n=sc.next();
		    String m=sc.next();
		    int start=0;int max=Integer.MIN_VALUE;int c=0;
		    for(int end=0;end<n.length();end++){
		        if(m.contains(n.charAt(end))){
		            c++;
		        }
		        while(!m.contains(n.charAt(end))){
		            start++;
		        }
		        max=Math.max(c,max);
		    }
		    System.out.println(max);
		}
		

	}
}
