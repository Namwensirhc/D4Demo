package d4Demo;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "hello";
		x = "hi";

		System.out.println(x);

		int num = 5;
		String stringNum = num + "";
		System.out.println(stringNum);

		String hello = "Hello";
		hello = hello.concat(" World");
		System.out.println(hello);

		String hello2 = "Hello";
		hello2 = hello2 + "World";

		boolean stringTester = !hello.equals(hello2);
		System.out.println(stringTester);

		String test = null;
		boolean nullTest = test == null;
		System.out.println(nullTest);

		char charTest = hello.charAt(3);
		System.out.println(charTest);

		String suff = "ed";

		System.out.println(hello.endsWith(suff));

		int indexText = hello.indexOf("l");
		System.out.println(indexText);

		hello.lastIndexOf("l");
		System.out.println(hello.lastIndexOf("l"));

		System.out.println(hello.length());

		System.out.println(hello.replace("ll", "ss"));

		String words = "This, is, just, a, test";
		String[] wordArray = words.split(",");
		System.out.println(wordArray[1]);
		System.out.println(hello.substring(0, 4));

		String y = "       y         ";
		System.out.println(y);
		System.out.println(y.trim());

	}

}
