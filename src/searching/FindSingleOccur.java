package searching;

public class FindSingleOccur {
	
	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int B=10;
		int solve = solve(A, B);
		System.out.println(solve);
	}

	public static int solve(int[] A, int B) {
		int[] ps = new int[A.length + 1];
		ps[0] = 0;
		for (int i = 0; i < A.length; i++) {
			ps[i + 1] = ps[i] + A[i];
		}
		int st = 0;
		int end = ps.length - 1;
		int res = 0;
		while (st <= end) {
			int mid = (st + end) / 2;
			if (ps[mid] <= B) {
				int k = mid;
				int i = 0;
				while (k < ps.length) {
					int sum = ps[k] - ps[i];
					if (sum <= B) {
						k++;
						i++;
					} else {
						break;
					}
				}
				if (k == ps.length ) {
					st = mid + 1;
				} else {
					end = mid - 1;
				}
			} else {
				end = mid - 1;
			}
			res = mid;
		}
		return res;
	}
}
