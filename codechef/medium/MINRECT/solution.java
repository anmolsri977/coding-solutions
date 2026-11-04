import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int minRow = n, maxRow = -1;
            int minCol = m, maxCol = -1;

            for(int i = 0; i < n; i++)
            {
                String s = sc.next();

                for(int j = 0; j < m; j++)
                {
                    if(s.charAt(j) == '1')
                    {
                        minRow = Math.min(minRow, i);
                        maxRow = Math.max(maxRow, i);

                        minCol = Math.min(minCol, j);
                        maxCol = Math.max(maxCol, j);
                    }
                }
            }

            int height = maxRow - minRow + 1;
            int width = maxCol - minCol + 1;

            System.out.println(height * width);
        }
    }
}