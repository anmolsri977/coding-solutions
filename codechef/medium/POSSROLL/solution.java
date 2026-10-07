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
		    int x=sc.nextInt();
		    int k=sc.nextInt();
		    int y=sc.nextInt();
		    boolean possible = true;

for(int i = 1; i <= x; i++) {
    if(y % (k * i) != 0) {
        possible = false;
        break;
    }
}

if(possible)
    System.out.println("YES");
else
    System.out.println("NO");
		    
		}

	}
}
