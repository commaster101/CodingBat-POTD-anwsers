public class Test_SumDigits extends GenericTestHarness
{
	
	public static void case8() {
		  assertEquals(4, SumDigits.sumDigits(1111));
	}

	
	public static void case7() {
		  assertEquals(10, SumDigits.sumDigits(730));
	}

	
	public static void case6() {
		  assertEquals(0, SumDigits.sumDigits(0));
	}

	
	public static void case5() {
		  assertEquals(1, SumDigits.sumDigits(1));
	}

	
	public static void case4() {
		  assertEquals(1, SumDigits.sumDigits(10));
	}

	
	public static void case3() {
		  assertEquals(3, SumDigits.sumDigits(12));
	}

	
	public static void case2() {
		  assertEquals(13, SumDigits.sumDigits(49));
	}

	
	public static void case1() {
		  assertEquals(9, SumDigits.sumDigits(126));
	}

	
	public static void case9() {
		  assertEquals(5, SumDigits.sumDigits(11111));
	}

	public static void case10() {
		assertEquals(3, SumDigits.sumDigits(10110));
  	}

	public static void case11() {
		assertEquals(10, SumDigits.sumDigits(235));
  	}

	public static void main(String[] args) {
		case8();
		case7();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
		case9();
		case10();
		case11();
	}
}
