public class Test_Sum13 extends GenericTestHarness
{
	
	public static void case13() {
		  assertEquals(0, Sum13.sum13(new int[] {13, 0}));
	}

	
	public static void case12() {
		  assertEquals(0, Sum13.sum13(new int[] {0}));
	}

	
	public static void case11() {
		  assertEquals(5, Sum13.sum13(new int[] {5, 13, 2}));
	}

	
	public static void case4() {
		  assertEquals(3, Sum13.sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
	}

	
	public static void case1() {
		  assertEquals(6, Sum13.sum13(new int[] {1, 2, 2, 1}));
	}

	
	public static void case2() {
		  assertEquals(2, Sum13.sum13(new int[] {1, 1}));
	}

	
	public static void case3() {
		  assertEquals(6, Sum13.sum13(new int[] {1, 2, 2, 1, 13}));
	}

	
	public static void case10() {
		  assertEquals(14, Sum13.sum13(new int[] {5, 7, 2}));
	}

	
	public static void case9() {
		  assertEquals(0, Sum13.sum13(new int[] {13, 1, 13}));
	}

	
	public static void case8() {
		  assertEquals(0, Sum13.sum13(new int[] {13, 0, 13}));
	}

	
	public static void case7() {
		  assertEquals(0, Sum13.sum13(new int[] {13, 13}));
	}

	
	public static void case6() {
		  assertEquals(0, Sum13.sum13(new int[] {13}));
	}

	
	public static void case5() {
		  assertEquals(0, Sum13.sum13(new int[] {}));
	}

	public static void main(String[] args) {
		case13();
		case12();
		case11();
		case4();
		case1();
		case2();
		case3();
		case10();
		case9();
		case8();
		case7();
		case6();
		case5();
	}
}
