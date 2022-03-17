package VetorMatriz;

public class DadoVetor {

	public static void main(String[] args) {
		
		int[] nums  = new int[11];
		
		nums[0] = 3;
		nums[1] = 4;
		nums[2] = 2;
		nums[3] = 5;
		nums[4] = 1;
		nums[5] = 3;
		nums[6] = 2;
		nums[7] = 1;
		nums[8] = 6;
		nums[9] = 5;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		System.out.println(nums[4]);
		System.out.println(nums[5]);
		System.out.println(nums[6]);
		System.out.println(nums[7]);
		System.out.println(nums[8]);
		System.out.println(nums[9]);
System.out.println();
		
		int media = 0;
		for(int i = 0; i<nums.length; i++) {
			media += nums [i];
		}
		
		float total = (float)media / nums.length;
		
		System.out.println("A media é: " +total);
		System.out.println();
		System.out.println("A maior pontuação foi gerada: 1 vez");
		

	}

}