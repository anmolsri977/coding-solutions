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
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++){
		        a[i]=sc.nextInt();
		    }
		    Arrays.sort(a);
		    if(n==2){
		        System.out.println(0);
		        continue;
		    }
		    int p=a[n-1]-a[1];
		    int q=a[n-2]-a[0];
		    int ans=Math.min(p,q);
		    System.out.println(ans);
		}

	}
}
