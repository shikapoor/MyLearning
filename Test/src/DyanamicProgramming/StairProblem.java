package DyanamicProgramming;

public class StairProblem {
	
	public static void main(String args[]) {
		System.out.println(waysToClimb(5));

	}
	
	public static int waysToClimb(int nthStep)
	{
		int[] arr = new int[nthStep+1];
		arr[1] = 1;
		arr[2] = 2;
		for(int indx = 3; indx <= nthStep; indx++)
		{
			arr[indx] = arr[indx-1] + arr[indx-2];
		}
		return arr[nthStep];
	}
	
	

}
