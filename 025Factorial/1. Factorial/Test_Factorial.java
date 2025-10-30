public class Test_Factorial extends GenericTestHarness
{
	
	public static void case7() {
		  assertEquals(5040, Factorial.factorial(7));
	}

	
	public static void case6() {
		  assertEquals(720, Factorial.factorial(6));
	}

	
	public static void case5() {
		  assertEquals(120, Factorial.factorial(5));
	}

	
	public static void case4() {
		  assertEquals(24, Factorial.factorial(4));
	}

	
	public static void case3() {
		  assertEquals(6, Factorial.factorial(3));
	}

	
	public static void case2() {
		  assertEquals(2, Factorial.factorial(2));
	}

	
	public static void case1() {
		  assertEquals(1, Factorial.factorial(1));
	}

	
	public static void case9() {
		  assertEquals(479001600, Factorial.factorial(12));
	}

	
	public static void case8() {
		  assertEquals(40320, Factorial.factorial(8));
	}

	public static void main(String[] args) {
		case7();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
		case9();
		case8();
	}
}
