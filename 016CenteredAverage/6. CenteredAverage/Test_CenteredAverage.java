public class Test_CenteredAverage extends GenericTestHarness
{
	
	public static void case16() {
		  assertEquals(6, CenteredAverage.centeredAverage(new int[] {6, 4, 8, 12, 3}));
	}

	
	public static void case15() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {4, 4, 4, 1, 5}));
	}

	
	public static void case14() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {4, 4, 4, 4, 5}));
	}

	
	public static void case13() {
		  assertEquals(50, CenteredAverage.centeredAverage(new int[] {1000, 0, 1, 99}));
	}

	
	public static void case12() {
		  assertEquals(50, CenteredAverage.centeredAverage(new int[] {1, 1, 99, 99}));
	}

	
	public static void case11() {
		  assertEquals(7, CenteredAverage.centeredAverage(new int[] {1, 7, 8}));
	}

	
	public static void case10() {
		  assertEquals(7, CenteredAverage.centeredAverage(new int[] {7, 7, 7}));
	}

	
	public static void case9() {
		  assertEquals(1, CenteredAverage.centeredAverage(new int[] {1, 1, 100}));
	}

	
	public static void case8() {
		  assertEquals(3, CenteredAverage.centeredAverage(new int[] {0, 2, 3, 4, 100}));
	}

	
	public static void case7() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {4, 0, 100}));
	}

	
	public static void case6() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {100, 0, 5, 3, 4}));
	}

	
	public static void case5() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {5, 3, 4, 0, 100}));
	}

	
	public static void case4() {
		  assertEquals(4, CenteredAverage.centeredAverage(new int[] {5, 3, 4, 6, 2}));
	}

	
	public static void case3() {
		  assertEquals(-3, CenteredAverage.centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
	}

	
	public static void case2() {
		  assertEquals(5, CenteredAverage.centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
	}

	
	public static void case1() {
		  assertEquals(3, CenteredAverage.centeredAverage(new int[] {1, 2, 3, 4, 100}));
	}

	public static void main(String[] args) {
		case16();
		case15();
		case14();
		case13();
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
