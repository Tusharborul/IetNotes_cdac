
public class AddNumber {

	public static void main(String[] args) {
		int sum = 0;
		int[] ar = { 1, 2, 3, 5, 7, 9 };

		for (int i = 0; i < ar.length; i++) {
			int n = ar[i];
			sum = sum + prime(n);

			// TODO Auto-generated method stub
		}
		System.out.println(sum);

	}

	public static int prime(int a) {
		boolean isPrime = false;
		if (a == 2) {
			isPrime = true;
		}
		for (int i = 2; i < a; i++) {
			if (a % i == 0) {
				isPrime = true;
			}

		}
		if (isPrime) {
			return a;
		} else {
			return 0;
		}
	}

}
