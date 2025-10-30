public class Test_BunnyEars2 extends GenericTestHarness
{
	
	public static void case1() {
		  assertEquals(0, BunnyEars2.bunnyEars2(0));
	}

	
	public static void case2() {
		  assertEquals(2, BunnyEars2.bunnyEars2(1));
	}

	
	public static void case3() {
		  assertEquals(5, BunnyEars2.bunnyEars2(2));
	}

	
	public static void case4() {
		  assertEquals(7, BunnyEars2.bunnyEars2(3));
	}

	
	public static void case5() {
		  assertEquals(10, BunnyEars2.bunnyEars2(4));
	}

	
	public static void case6() {
		  assertEquals(12, BunnyEars2.bunnyEars2(5));
	}

	
	public static void case7() {
		  assertEquals(15, BunnyEars2.bunnyEars2(6));
	}

	
	public static void case8() {
		  assertEquals(25, BunnyEars2.bunnyEars2(10));
	}

	public static void main(String[] args) {
		case1();
		case2();
		case3();
		case4();
		case5();
		case6();
		case7();
		case8();
	}
}
