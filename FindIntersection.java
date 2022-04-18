package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A= {3,2,11,4,6,7};
		int [] B= {1,2,8,4,9,7};
		int[] C = new int[10];
		int k=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<B.length;j++)
			{
				if(A[i]==B[j])
				{
					C[k]=A[i];
					System.out.println(C[k]);
					k++;
				}
			}
		}

	}

}
