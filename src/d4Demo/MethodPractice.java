package d4Demo;

public class MethodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Methods that we write cannot be written in the main method

		sayHello();
		String hi = sayHelloName("Chris");
		System.out.println(hi);
		System.out.println(sayHelloName("Ben"));
		MethodPractice test = new MethodPractice();
		boolean numCheck = test.checkSeven(7, "Chris");
		System.out.println(numCheck);
		System.out.println(daySeconds(36));
		System.out.println(testSeconds(72));
	}
// Methods would live here

	/*
	 * 5 steps for writing methods 1. visibility modifier (required) public or
	 * private 2. static or nothing (if not static we need to create an object to
	 * call it) 3. return type; should match what you need to return, if nothing
	 * void 4. method name: Should be a verb to show action 5. Parameter list:
	 * things we need in the method, it can be blank
	 */

	public static void sayHello() {
		System.out.println("Hello");
	}

// because this is a typed method we need to put it in a sysout to see the value
	public static String sayHelloName(String name) {
		// if we declare a type for our method, the return need to match
		// must use the keyword return
		return "Hello, " + name + "!";
	}

	// we can use private here because this method only needs to be used in this
	// class
	private boolean checkSeven(int num, String name) {
		System.out.println("This is a test");
		boolean test = (num == 7) && name.equalsIgnoreCase("Chris");
		return num == 7;

	}

	public static int daySeconds(int hours) {

		int seconds = hours * 60 * 60;
		return seconds;

	}

	public static boolean testSeconds(int hours2) {
		boolean test = daySeconds(hours2) == 86400;
		return test;
	}
}
