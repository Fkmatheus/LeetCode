package exe;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		System.out.println(removeDuplicates(nums));

	}

	public static int removeDuplicates(int[] nums) {
		int k;
		
		int leitor = 0;
		int iterador = 1;
		
		while (iterador < nums.length) {
			if (nums[leitor]!=nums[iterador]) {
				leitor++;
				nums[leitor] = nums[iterador];
				iterador++;
			}
			
			else {
				iterador++;
			}
			
		}
		
		k = leitor + 1;
		
		return k;
		
		
    }
	
}
