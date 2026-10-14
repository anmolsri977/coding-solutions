import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }

            Arrays.sort(A);

            long ans = 0;

            for (int i = N - 1; i >= N - K - 1; i--) {
                ans += A[i];
            }

            System.out.println(ans);
        }

        
    }
}