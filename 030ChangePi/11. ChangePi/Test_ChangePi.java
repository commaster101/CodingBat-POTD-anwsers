public class Test_ChangePi extends GenericTestHarness
{
	
	public static void case6() {
		  assertEquals("p", ChangePi.changePi("p"));
	}

	
	public static void case10() {
		  assertEquals("xyzzy", ChangePi.changePi("xyzzy"));
	}

	
	public static void case2() {
		  assertEquals("3.143.14", ChangePi.changePi("pipi"));
	}

	
	public static void case1() {
		  assertEquals("x3.14x", ChangePi.changePi("xpix"));
	}

	
	public static void case9() {
		  assertEquals("3.14xx", ChangePi.changePi("pixx"));
	}

	
	public static void case8() {
		  assertEquals("", ChangePi.changePi(""));
	}

	
	public static void case7() {
		  assertEquals("x", ChangePi.changePi("x"));
	}

	
	public static void case5() {
		  assertEquals("hip", ChangePi.changePi("hip"));
	}

	
	public static void case4() {
		  assertEquals("3.14", ChangePi.changePi("pi"));
	}

	
	public static void case3() {
		  assertEquals("3.14p", ChangePi.changePi("pip"));
	}

	public static void main(String[] args) {
		case6();
		case10();
		case2();
		case1();
		case9();
		case8();
		case7();
		case5();
		case4();
		case3();
	}
}
