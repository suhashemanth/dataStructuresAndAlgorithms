package searching;

public class Search {
	
	public static void main(String[] args) {
		int[] searchRange = searchRange(new int[] {4, 7, 7, 7, 8, 10, 10 }, 3);
		System.out.println(searchRange[0]+" "+searchRange[1]);
	}
	
	public static int[] searchRange(final int[] A, int B) {
        int st=0;
        int end=A.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(A[mid]==B)
            {
                end=mid;
            }
            else if(A[mid]>B)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        int first=end;
        st=0;
        end=A.length-1;
        while(st<=end)
        {
            int mid=(st+end)/2;
            if(A[mid]==B)
            {
                st=mid+1;
            }
            else if(A[mid]>B)
            {
                end=mid-1;
            }
            else
            {
                st=mid+1;
            }
        }
        int second=end;
        return new int[]{first,second};
    }

}
