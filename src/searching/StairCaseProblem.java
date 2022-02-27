package searching;

public class StairCaseProblem {
	
	public static void main(String[] args) {
		int solve = solve(92761);
		System.out.println(solve);
	}
	public static int solve(int A) {
        int st=1;
        int end=A;
        while(st<=end)
        {
            int mid=(st+end)/2;
            long value=((mid*1l)*(mid+1)*1l)/2;
            if(value==(A*1l))
            {
                return mid;
            }
            else if(value>(A*1l))
            {
                end=mid-1;
            }
            else
            {
               st=mid+1; 
            }
        }
        return end;
    }

}
