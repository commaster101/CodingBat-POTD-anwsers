public class Test_Lucky13 extends GenericTestHarness
{
	
	public static void case6() {
		  assertEquals(false, Lucky13.lucky13(new int[] {3, 7, 2, 8}));
	}

	
	public static void case9() {
		  assertEquals(true, Lucky13.lucky13(new int[] {2, 2}));
	}

	
	public static void case1() {
		  assertEquals(true, Lucky13.lucky13(new int[] {0, 2, 4}));
	}

	
	public static void case2() {
		  assertEquals(false, Lucky13.lucky13(new int[] {1, 2, 3}));
	}

	
	public static void case3() {
		  assertEquals(false, Lucky13.lucky13(new int[] {1, 2, 4}));
	}

	
	public static void case4() {
		  assertEquals(true, Lucky13.lucky13(new int[] {2, 7, 2, 8}));
	}

	
	public static void case5() {
		  assertEquals(false, Lucky13.lucky13(new int[] {2, 7, 1, 8}));
	}

	
	public static void case8() {
		  assertEquals(false, Lucky13.lucky13(new int[] {1, 2}));
	}

	
	public static void case11() {
		  assertEquals(true, Lucky13.lucky13(new int[] {}));
	}

	
	public static void case12() {
		  assertEquals(false, Lucky13.lucky13(new int[] {3}));
	}

	
	public static void case10() {
		  assertEquals(true, Lucky13.lucky13(new int[] {2}));
	}

	
	public static void case7() {
		  assertEquals(false, Lucky13.lucky13(new int[] {2, 7, 2, 1}));
	}

	public static void main(String[] args) {
		case6();
		case9();
		case1();
		case2();
		case3();
		case4();
		case5();
		case8();
		case11();
		case12();
		case10();
		case7();
	}
}
