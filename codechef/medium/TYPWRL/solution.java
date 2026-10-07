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
		    int n=sc.nextInt();
		    int m=sc.nextInt();
		    String s=sc.next();
		    String l=sc.next();
		    int curr=1;
		    int ans=1;
		    for(int i=1;i<n;i++){
		        boolean hand1=l.contains(""+s.charAt(i-1));
		        boolean hand2=l.contains(""+s.charAt(i));
		        if(hand1==hand2){
		            curr++;
		            
		        }
		        else{
		            curr=1;
		        }
		        ans=Math.max(ans,curr);
		    }
		    System.out.println(ans);
		}
		

	}
}
