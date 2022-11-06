package ch06;

public class Ex6_6 {
	public static void main(String[] args) {
		int[] evens = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};
		int [] primes = {2, 3, 5, 7, 11, 13, 17, 19};
		
		int evenSum = sum(evens);
		int	primeSum = sum(primes);
		
		System.out.printf("짝수 배열의 합 : %d	\n", evenSum);
		System.out.printf("소수 배열의 합 : %d\n", primeSum);
		
	}
	public static int sum(int[] arr) {
		int ret = 0;
		for(int i = 0; i < arr.length; i++) {
			ret += arr[i];
		}
		return (ret);
	}

}
