import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		
		    int x=sc.nextInt();
		    int k=sc.nextInt();
		    int y=sc.nextInt();
		    if(y%k == 0 && y/k >=1 && y/k<=x){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		    
		

	}
}
