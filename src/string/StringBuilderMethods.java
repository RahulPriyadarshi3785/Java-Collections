package string;

public class StringBuilderMethods {

	public static void stringBuilderMethods() {
		//Mutable
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("String");
		//new StringBuilder(String) -> constructor
		String s="String";
		sb.append('c'); //"c" -> it is a stringBuilder type
		// append character at end of stringbuilder
		sb.append("Hello"); //cHello
		sb.append(10); //cHello10
		sb.append(new char[] {'a','b', 'c'});//cHello10abc
		System.out.println("append : " + sb);
		System.out.println("equals : " + s.equals(sb1));//false
		StringBuilder sb2 = new StringBuilder("x");//x
		StringBuilder sb3 = new StringBuilder("x");//x
		System.out.println("equals : " + sb2.equals(sb3));//false
		/* StringBuilder equals method compares address not values*/
		System.out.println("equals : " + sb2.toString().equals(sb3.toString()));
		//true
		System.out.println("reverse : " + sb1.reverse());//gnirtS
		
		/* confusion htao over equals method
		 * Object class equals method -> compares two objects(both values and locations)
		 * String class equals method -> compares only values not location
		 * Integer class equals method -> better use == dumbshit they are same
		 * StringBuilder class equals method -> compares two objects(both values and locations)
		 */
		
	}

	public static void main(String[] args) {
		stringBuilderMethods();
	}

}
