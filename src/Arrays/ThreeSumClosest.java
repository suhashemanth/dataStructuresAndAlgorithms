package basicAlgorithms;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] A = {5, -2, -1, -10, 10};
		int B = 5;
		Arrays.sort(A);
		int min = Integer.MAX_VALUE;
		int value = 0;
		for (int i = 0; i < A.length - 2; i++) {
			int j = i + 1;
			int k = A.length - 1;
			int sum = A[i] + A[j] + A[k];
			while (j < k) {
				if (Math.abs(B - sum) <= Math.abs(min)) {
					min = B - sum;
					value = sum;
				}
				if (sum > B) {
					k--;
				} else {
					j++;
				}
				sum=A[i]+A[j]+A[k];
			}
		}
		System.out.println(value);
	}

}
