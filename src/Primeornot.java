import java.util.Scanner;
public class Primeornot {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        boolean isPrime = isPrime(number);

	        System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) return false;
	        }
	        return true;
	    }
		

	}


