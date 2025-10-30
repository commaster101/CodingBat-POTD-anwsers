public class Test_Sum67 extends GenericTestHarness
{
	
	public static void case7() {
		  assertEquals(9, Sum67.sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));
	}

	
	public static void case4() {
		  assertEquals(2, Sum67.sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
	}

	
	public static void case14() {
		  assertEquals(11, Sum67.sum67(new int[] {2, 2, 6, 7, 7}));
	}

	
	public static void case12() {
		  assertEquals(11, Sum67.sum67(new int[] {6, 7, 11}));
	}

	
	public static void case11() {
		  assertEquals(0, Sum67.sum67(new int[] {}));
	}

	
	public static void case10() {
		  assertEquals(0, Sum67.sum67(new int[] {6, 8, 1, 6, 7}));
	}

	
	public static void case9() {
		  assertEquals(8, Sum67.sum67(new int[] {6, 7, 1, 6, 7, 7}));
	}

	
	public static void case8() {
		  assertEquals(8, Sum67.sum67(new int[] {1, 6, 7, 7}));
	}

	
	public static void case6() {
		  assertEquals(18, Sum67.sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));
	}

	
	public static void case5() {
		  assertEquals(2, Sum67.sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
	}

	
	public static void case3() {
		  assertEquals(4, Sum67.sum67(new int[] {1, 1, 6, 7, 2}));
	}

	
	public static void case2() {
		  assertEquals(5, Sum67.sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
	}

	
	public static void case13() {
		  assertEquals(22, Sum67.sum67(new int[] {11, 6, 7, 11}));
	}

	
	public static void case1() {
		  assertEquals(5, Sum67.sum67(new int[] {1, 2, 2}));
	}

	public static void main(String[] args) {
		case7();
		case4();
		case14();
		case12();
		case11();
		case10();
		case9();
		case8();
		case6();
		case5();
		case3();
		case2();
		case13();
		case1();
	}
}
