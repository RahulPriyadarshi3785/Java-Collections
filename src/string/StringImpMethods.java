package string;

import java.util.Arrays;

public class StringImpMethods {

	public static void stringImpMethods() {
		String s1="a", s2="a";
		//both pointing to same location in memory
		//Heap -> string constant pool
		String s3=new String("a"), s4=new String("a");
		//Stack -> different memory location
		System.out.println(s1==s2); //true
		// In case of string == will check its hashcode
		System.out.println(s3==s4); //false
		System.out.println(s1==s3); //false
		System.out.println(s1.equals(s3)); //true
		// compares value instead of hashcode
		Character c=s1.charAt(0);
		System.out.println("charAt : " + c); // 'a'
		System.out.println("compareTo : " + s1.compareTo(s3));//0
		System.out.println("compareToIgnoreCase : " + s1.compareToIgnoreCase("A"));//0
		System.out.println("copyValueOf : " + String.copyValueOf(new char[] {'a','b','c'}));
		//"abc"
		System.out.println("endsWith : " + "Abc".endsWith("bc"));//true
		System.out.println("startsWith : " + "Abc".startsWith("Ab"));//true
		System.out.println("equalsIgnoreCase : " + "Abc".equalsIgnoreCase("abC"));
		//true
		System.out.println("indexOf : " + "Abcde".indexOf("bc"));//1
		System.out.println("indexOf : " + "Abcde".indexOf("bc",3));//-1
		System.out.println("replace : " + "Abcdbce".replace("bc","xx"));//Axxdbce
		System.out.println("replaceFirst : " + "Abcdbce".replaceFirst("bc","xx"));
		//Axxdbce
		System.out.println("length : " + "Abcde".length());//5
		System.out.println("split : " + Arrays.toString("Abcdbce".split("bc")));//"A","d","e"
		System.out.println("split : " + Arrays.toString("Abcdbce".split("bc", 2)));//"A", "dbce"
		System.out.println("substring : " + "Abcdbce".substring(2));//"cdbce"
		System.out.println("substring : " + "Abcdbce".substring(2, 5));//"cdb"
		System.out.println("toCharArray : " + "Abcdbce".toCharArray());
		//address array ['A','b','c','d','b','c','e']
		System.out.println("toCharArray : " + Arrays.toString("Abcdbce".toCharArray()));
		//['A','b','c','d','b','c','e']
		System.out.println("toLowerCase : " + "Abcdbce".toLowerCase());//"abcdbce"
		System.out.println("toUpperCase : " + "Abcdbce".toUpperCase());//"ABCDBCE"
		System.out.println("trim : " + "\n\tAbcdbce   ".trim());//"Abcdbce"
		Integer x=9;
		System.out.println(x.toString());//"9"
		System.out.println("valueOf : " + String.valueOf(x));//"9"
		int y=5;
//		System.out.println(y.toString());//"Error"
		System.out.println("valueOf : " + String.valueOf(y));//"5"
	}

	public static void main(String[] args) {
		stringImpMethods();
	}

}
