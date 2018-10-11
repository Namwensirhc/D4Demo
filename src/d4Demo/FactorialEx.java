package d4Demo;

public class FactorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getFact(4));
		System.out.println(getFactRecursive(2));
	}

	public static long getFact(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}

// This is a recursion
	public static long getFactRecursive(int num2) {
		if (num2 == 1 || num2 == 0) {
			return 1;
		}
		return num2 * getFactRecursive(num2 - 1);
	}
}
