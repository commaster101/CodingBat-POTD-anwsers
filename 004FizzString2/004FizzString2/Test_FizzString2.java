public class Test_FizzString2 extends GenericTestHarness
{
	
	public static void case1() {
		assertEquals("1!", FizzString2.fizzString(1));
	}

	public static void case2() {
		assertEquals("2!", FizzString2.fizzString(2));
	}

	public static void case3() {
		assertEquals("Fizz!", FizzString2.fizzString(3));
	}

	public static void case4() {
		assertEquals("4!", FizzString2.fizzString(4));
	}

	public static void case5() {
		assertEquals("Buzz!", FizzString2.fizzString(5));
	}
	
	public static void case6() {
		assertEquals("Fizz!", FizzString2.fizzString(6));
	}

	public static void case7() {
		assertEquals("7!", FizzString2.fizzString(7));
	}

	public static void case8() {
		  assertEquals("8!", FizzString2.fizzString(8));
	}

	public static void case9() {
		  assertEquals("Fizz!", FizzString2.fizzString(9));
	}
	
	public static void case10() {
		assertEquals("FizzBuzz!", FizzString2.fizzString(15));
	}

	public static void case11() {
		assertEquals("16!", FizzString2.fizzString(16));
	}

	public static void case12() {
		assertEquals("Fizz!", FizzString2.fizzString(18));
	}

	public static void case13() {
		assertEquals("FizzBuzz!", FizzString2.fizzString(45));
	}

	public static void case14() {
		assertEquals("Buzz!", FizzString2.fizzString(100));
	}
	

	public static void main(String[] args) 
	{
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
		case9();
		case10();
		case11();
		case12();
		case13();
		case14();
	}
}