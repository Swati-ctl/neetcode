package arrayandhashing;

public class ConcatenationofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcatenationofArray obj= new ConcatenationofArray();
		int ans[]=obj.getConcatenationOptimal(new int[] {1,2,3, 4});

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
	 
	 public int[] getConcatenationOptimal(int[] nums) {
	       int[] ans= new int[2 * nums.length];  
	       System.out.println("length of ans ="+ ans.length);
	        	for(int j=0; j<nums.length; j++)
	        	{
	        		
	            ans[j]= nums[j];
	            ans[nums.length+j]=nums[j];
	            
	        	}

	        
	       
	       return ans;
	    }
}
