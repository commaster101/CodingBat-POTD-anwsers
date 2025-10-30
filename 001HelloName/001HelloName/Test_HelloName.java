public class Test_HelloName extends GenericTestHarness
{
	
	public static void case10() {
		  assertEquals("Hello Hello!", HelloName.helloName("Hello"));
	}

	
	public static void case8() {
		  assertEquals("Hello ho ho ho!", HelloName.helloName("ho ho ho"));
	}

	
	public static void case7() {
		  assertEquals("Hello Goodbye!", HelloName.helloName("Goodbye"));
	}

	
	public static void case9() {
		  assertEquals("Hello xyz!", HelloName.helloName("xyz"));
	}

	
	public static void case6() {
		  assertEquals("Hello Omega!", HelloName.helloName("Omega"));
	}

	
	public static void case5() {
		  assertEquals("Hello Alpha!", HelloName.helloName("Alpha"));
	}

	
	public static void case4() {
		  assertEquals("Hello Dolly!", HelloName.helloName("Dolly"));
	}

	
	public static void case3() {
		  assertEquals("Hello X!", HelloName.helloName("X"));
	}

	
	public static void case2() {
		  assertEquals("Hello Alice!", HelloName.helloName("Alice"));
	}

	
	public static void case1() {
		  assertEquals("Hello Bob!", HelloName.helloName("Bob"));
	}

	public static void main(String[] args) {
		case10();
		case8();
		case7();
		case9();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
	}
}
