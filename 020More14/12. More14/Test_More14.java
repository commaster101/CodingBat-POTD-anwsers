public class Test_More14 extends GenericTestHarness
{
	
	public static void case14() {
		  assertEquals(true, More14.more14(new int[] {1, 4, 1, 4, 1, 6}));
	}

	
	public static void case12() {
		  assertEquals(false, More14.more14(new int[] {4, 1, 4, 6}));
	}

	
	public static void case9() {
		  assertEquals(true, More14.more14(new int[] {1, 1, 4, 4, 1}));
	}

	
	public static void case7() {
		  assertEquals(true, More14.more14(new int[] {6, 1, 1}));
	}

	
	public static void case5() {
		  assertEquals(true, More14.more14(new int[] {1}));
	}

	
	public static void case3() {
		  assertEquals(true, More14.more14(new int[] {1, 1}));
	}

	
	public static void case2() {
		  assertEquals(false, More14.more14(new int[] {1, 4, 1, 4}));
	}

	
	public static void case8() {
		  assertEquals(false, More14.more14(new int[] {1, 6, 4}));
	}

	
	public static void case6() {
		  assertEquals(false, More14.more14(new int[] {1, 4}));
	}

	
	public static void case1() {
		  assertEquals(true, More14.more14(new int[] {1, 4, 1}));
	}

	
	public static void case10() {
		  assertEquals(true, More14.more14(new int[] {1, 1, 6, 4, 4, 1}));
	}

	
	public static void case13() {
		  assertEquals(false, More14.more14(new int[] {4, 1, 4, 6, 1}));
	}

	
	public static void case11() {
		  assertEquals(false, More14.more14(new int[] {}));
	}

	
	public static void case4() {
		  assertEquals(true, More14.more14(new int[] {1, 6, 6}));
	}

	public static void main(String[] args) {
		case14();
		case12();
		case9();
		case7();
		case5();
		case3();
		case2();
		case8();
		case6();
		case1();
		case10();
		case13();
		case11();
		case4();
	}
}
