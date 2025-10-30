public class Test_BigDiff extends GenericTestHarness
{
	
	public static void case4() {
		  assertEquals(8, BigDiff.bigDiff(new int[] {2, 10}));
	}

	
	public static void case5() {
		  assertEquals(8, BigDiff.bigDiff(new int[] {10, 2}));
	}

	
	public static void case1() {
		  assertEquals(7, BigDiff.bigDiff(new int[] {10, 3, 5, 6}));
	}

	
	public static void case3() {
		  assertEquals(8, BigDiff.bigDiff(new int[] {2, 10, 7, 2}));
	}

	
	public static void case2() {
		  assertEquals(8, BigDiff.bigDiff(new int[] {7, 2, 10, 9}));
	}

	
	public static void case11() {
		  assertEquals(3, BigDiff.bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
	}

	
	public static void case10() {
		  assertEquals(3, BigDiff.bigDiff(new int[] {7, 6, 8, 5}));
	}

	
	public static void case7() {
		  assertEquals(0, BigDiff.bigDiff(new int[] {2, 2}));
	}

	
	public static void case9() {
		  assertEquals(8, BigDiff.bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
	}

	
	public static void case8() {
		  assertEquals(0, BigDiff.bigDiff(new int[] {2}));
	}

	
	public static void case6() {
		  assertEquals(1, BigDiff.bigDiff(new int[] {2, 3}));
	}

	public static void main(String[] args) {
		case4();
		case5();
		case1();
		case3();
		case2();
		case11();
		case10();
		case7();
		case9();
		case8();
		case6();
	}
}
