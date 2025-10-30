public class Test_CountEvens extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals(3, CountEvens.countEvens(new int[] {2, 1, 2, 3, 4}));
	}

	
	public static void case3() {
		  assertEquals(0, CountEvens.countEvens(new int[] {1, 3, 5}));
	}

	
	public static void case2() {
		  assertEquals(3, CountEvens.countEvens(new int[] {224, 3432, 0}));
	}

	
	public static void case8() {
		  assertEquals(2, CountEvens.countEvens(new int[] {2, 5, 12}));
	}

	
	public static void case7() {
		  assertEquals(1, CountEvens.countEvens(new int[] {2}));
	}

	
	public static void case6() {
		  assertEquals(2, CountEvens.countEvens(new int[] {2, 11, 9, 0}));
	}

	
	public static void case5() {
		  assertEquals(1, CountEvens.countEvens(new int[] {11, 9, 0, 1}));
	}

	
	public static void case4() {
		  assertEquals(0, CountEvens.countEvens(new int[] {}));
	}

	public static void main(String[] args) {
		case1();
		case3();
		case2();
		case8();
		case7();
		case6();
		case5();
		case4();
	}
}
