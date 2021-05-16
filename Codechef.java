
/* package codechef; // don't place package name! */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {

	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args) {
		FastReader scanner = new FastReader();
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			int N = scanner.nextInt();
			int x = scanner.nextInt();
			int k = scanner.nextInt();
			if ((x % k == 0 && x / k < N + 2) || ((N - x + 1) % k == 0 && (N - x + 1) / k < N + 2))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
