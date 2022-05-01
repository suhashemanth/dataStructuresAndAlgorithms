package dynamicProgramming;

import java.util.ArrayList;

public class LongestPalindromic {

	public static void main(String[] args) {

		String s = "ababa";
		int[][] dp = new int[s.length()][s.length()];
		
		ArrayList<Integer[]> list=new ArrayList<Integer[]>();

		for (int i = 0; i < s.length(); i++) {

			dp[i][i] = 1;
		}

		for (int i = 0; i < s.length()-1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				dp[i][i + 1] = 1;
			} else {
				dp[i][i + 1] = 0;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 2; j < s.length(); j++) {
				int check = 0;
				if (s.charAt(i) == s.charAt(j)) {
					check = 1;
				}
				dp[i][j] = (dp[i+1][j - 1]) & check;
			}
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
	}

}
