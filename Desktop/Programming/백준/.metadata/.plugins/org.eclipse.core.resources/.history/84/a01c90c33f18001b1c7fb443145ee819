package _2577;

import java.util.Scanner;

public class _2577 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int num = A*B*C;
		int[] result = new int[10];
		
		while(num >= 1) {
			int temp = num % 10;
			int tempResult = result[temp];
			result[temp] = tempResult + 1;
			num = num / 10;
		}
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}

}
