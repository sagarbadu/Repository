
public class productOfArray {

	public static void main(String[] args) {
    int nums[] = {1,2,3,4,5};
  System.out.println("The product of these numbers is: " + Array(nums));

	}
	
	public static int Array(int nums[]) {
		int product = 1;
		
		for (int counter = 0; counter < nums.length; counter++) {
			product = product * nums[counter];
		}
		

		return product;
	

	}

}
