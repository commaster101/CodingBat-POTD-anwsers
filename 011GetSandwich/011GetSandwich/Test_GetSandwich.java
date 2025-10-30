public class Test_GetSandwich extends GenericTestHarness
{
	
	public static void case12() {
		  assertEquals("breadbread", GetSandwich.getSandwich("breadbreadbreadbread"));
	}

	
	public static void case11() {
		  assertEquals("y", GetSandwich.getSandwich("breaxbreadybread"));
	}

	
	public static void case10() {
		  assertEquals("breax", GetSandwich.getSandwich("breadbreaxbread"));
	}

	
	public static void case9() {
		  assertEquals("", GetSandwich.getSandwich(""));
	}

	
	public static void case8() {
		  assertEquals("", GetSandwich.getSandwich("xyz"));
	}

	
	public static void case7() {
		  assertEquals("", GetSandwich.getSandwich("abxbreaz"));
	}

	
	public static void case6() {
		  assertEquals("", GetSandwich.getSandwich("breadbread"));
	}

	
	public static void case5() {
		  assertEquals("A", GetSandwich.getSandwich("breadAbread"));
	}

	
	public static void case4() {
		  assertEquals("breadjam", GetSandwich.getSandwich("xxbreadbreadjambreadyy"));
	}

	
	public static void case3() {
		  assertEquals("", GetSandwich.getSandwich("xxbreadyy"));
	}

	
	public static void case2() {
		  assertEquals("jam", GetSandwich.getSandwich("xxbreadjambreadyy"));
	}

	
	public static void case1() {
		  assertEquals("jam", GetSandwich.getSandwich("breadjambread"));
	}

	public static void main(String[] args) {
		case12();
		case11();
		case10();
		case9();
		case8();
		case7();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
	}
}
