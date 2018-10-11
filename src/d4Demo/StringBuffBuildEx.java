package d4Demo;

public class StringBuffBuildEx {

	public static void main(String[] args) {
		String testing = "Hello World";

		for (int i = 0; i < testing.length(); i++) {
			System.out.println(testing.charAt(i));
		}

		StringBuffer sb = new StringBuffer();
		sb.append("I'm learning stuff.");
		sb.append(" Java is so cool!");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.reverse().toString().toUpperCase());
	}
}
