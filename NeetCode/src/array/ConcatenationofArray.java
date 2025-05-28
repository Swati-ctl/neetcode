package array;

public class ConcatenationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenationofArray obj= new ConcatenationofArray();
		int ans[]=obj.getConcatenation(new int[] {1,2,3, 4});

		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}

	}
	 public int[] getConcatenation(int[] nums) {
	       int[] ans= new int[2 * nums.length];  
	       System.out.println("length of ans ="+ ans.length);
	       int k=0;
	        for(int i=0; i<2; i++)
	        {
	        	for(int j=0; j<nums.length; j++)
	            ans[k++]= nums[j];

	        }
	       
	       return ans;
	    }
}
