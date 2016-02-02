package lesson2;

public class Lesson2 {
	public static void main(String[] args) {
		// void = doesn't return anything
		voidMethod();
		String a = "stringa";
		System.out.println();
		System.out.println("aadfadf");
		System.out.println(a);
		System.out.println(stringMethod());
		// sysout ctrl+space
		System.out.println(returnStringWithParameter("sending parameter"));
		System.out.println(count(44, 22));
	}

	public static void voidMethod() {
		System.out.println("Hello World");
	}

	public static String stringMethod() {
		String deal = "twothree";
		return deal;

	}

	public static String returnStringWithParameter(String param) {
		return param;

	}

	public static int count(int a, int b) {
		System.out.println("Counting sum of " + a + " plus " + b);
		int c = a + b;
		return c;

	}

	public static void mathsDemo () {
		int a = 1+2;
		int b = 1-2;
		int c = 1/2;
		int d = 1*2;
		double e = Math.PI;
		double f = Math.sqrt(4);
		
	}

}
