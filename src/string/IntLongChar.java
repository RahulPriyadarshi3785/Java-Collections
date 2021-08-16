package string;

public class IntLongChar {

	public IntLongChar() {
		// TODO Auto-generated constructor stub
	}

	public static void integerMethods() {
		Integer x=7;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.compare(4,6)); //if 4<6 -ve
		System.out.println(x.compareTo(6)); // if 7>6 +ve
		System.out.println(Integer.parseInt("12"));
		System.out.println(x.toString().getClass());
	}

	public static void longMethods() {
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}

	public static void characterMethods() {
		Character c='a', c1='0';
		System.out.println(c+c1);
		System.out.println(Character.isDigit(c1));
		System.out.println(Character.isLetter(c));
		System.out.println(Character.toString(c).getClass());
	}
	
	public static void main(String[] args) {
		integerMethods();
		longMethods();
		characterMethods();
	}

}
