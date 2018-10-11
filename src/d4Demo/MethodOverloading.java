package d4Demo;

public class MethodOverloading {

	public static void main(String[] args, String num) {
		// TODO Auto-generated method stub
		Robot r = new Robot("Betty", 6);
		System.out.println(r);
		Robot r2 = modifyMe(r);
		System.out.println(r2);
		System.out.println(r);
		double num2 = modifyMe(num);
		int num1 = 6;
		System.out.println(modifyMe(num));
		System.out.println(modifyMe(2, 2));
		System.out.println(modifyMe("9.87"));
	}

	// Method Overloading
	// 1. Methods must have the same name (don't have the same return type)
	// 2. Must have one of the following differences
	// a. diff param types
	// b. param order
	// c. Diff amount of parameters
	public static int modifyMe(int num) {
		return num * 56;
	}

	public static int modifyMe(int nums, int nums2) {
		return nums * nums2;
	}

	public static double modifyMe(String userNum) {
		double num = Double.parseDouble(userNum);
		return num;
	}

	public static Robot modifyMe(Robot r1) {
		r1.setAge(23);
		r1.setName("Grant Chirpus");
		return r1;
	}
}
