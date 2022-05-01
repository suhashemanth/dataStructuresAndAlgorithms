package recurssion;

public class CheckPalindrome {

	public static void main(String[] args) {
		String s = "bddb";
		System.out.println(validPalindrome(s));
	}

	public static boolean validPalindrome(String s) {

		if (checkIfPalin(s, 0, s.length() - 1) == true) {
			return true;
		}
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				return checkIfPalin(s, i + 1, j) | checkIfPalin(s, i, j - 1);
			} else {
				i++;
				j--;
			}

		}
		return true;
	}

	public static boolean checkIfPalin(String s, int i, int j) {
		if (i == j) {
			return true;
		}
		return (s.charAt(i) == s.charAt(j)) && checkIfPalin(s, i + 1, j - 1);
	}
}
