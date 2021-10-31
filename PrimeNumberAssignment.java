package week1.day1;

public class PrimeNumberAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 13;
		boolean isPrime = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % 2 == 0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(number + " is Prime Number");
		} else {
			System.out.println(number + " is not a Prime Number");
		}

	}
}
