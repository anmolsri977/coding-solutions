import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int D = sc.nextInt();

            while (true) {
                String s = N + "";
                
                if (!s.contains(D + "")) {
                    System.out.println(N);
                    break;
                }

                N++;
            }

            T--;
        }
    }
}
