public class Test_Has22 extends GenericTestHarness
{
	
	public static void case2() {
		  assertEquals(false, Has22.has22(new int[] {1, 2, 1, 2}));
	}

	
	public static void case10() {
		  assertEquals(true, Has22.has22(new int[] {2, 2}));
	}

	
	public static void case1() {
		  assertEquals(true, Has22.has22(new int[] {1, 2, 2}));
	}

	
	public static void case3() {
		  assertEquals(false, Has22.has22(new int[] {2, 1, 2}));
	}

	
	public static void case4() {
		  assertEquals(true, Has22.has22(new int[] {2, 2, 1, 2}));
	}

	
	public static void case5() {
		  assertEquals(false, Has22.has22(new int[] {1, 3, 2}));
	}

	
	public static void case6() {
		  assertEquals(true, Has22.has22(new int[] {1, 3, 2, 2}));
	}

	
	public static void case7() {
		  assertEquals(true, Has22.has22(new int[] {2, 3, 2, 2}));
	}

	
	public static void case8() {
		  assertEquals(true, Has22.has22(new int[] {4, 2, 4, 2, 2, 5}));
	}

	
	public static void case9() {
		  assertEquals(false, Has22.has22(new int[] {1, 2}));
	}

	
	public static void case11() {
		  assertEquals(false, Has22.has22(new int[] {2}));
	}

	
	public static void case12() {
		  assertEquals(false, Has22.has22(new int[] {}));
	}

	
	public static void case13() {
		  assertEquals(true, Has22.has22(new int[] {3, 3, 2, 2}));
	}

	
	public static void case14() {
		  assertEquals(false, Has22.has22(new int[] {5, 2, 5, 2}));
	}

	public static void main(String[] args) {
		case2();
		case10();
		case1();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
		case9();
		case11();
		case12();
		case13();
		case14();
	}
}
