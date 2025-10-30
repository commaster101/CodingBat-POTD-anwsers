public class Test_BunnyEars extends GenericTestHarness
{
	
	public static void case9() {
		  assertEquals(468, BunnyEars.bunnyEars(234));
	}

	
	public static void case7() {
		  assertEquals(24, BunnyEars.bunnyEars(12));
	}

	
	public static void case6() {
		  assertEquals(10, BunnyEars.bunnyEars(5));
	}

	
	public static void case5() {
		  assertEquals(8, BunnyEars.bunnyEars(4));
	}

	
	public static void case4() {
		  assertEquals(6, BunnyEars.bunnyEars(3));
	}

	
	public static void case3() {
		  assertEquals(4, BunnyEars.bunnyEars(2));
	}

	
	public static void case2() {
		  assertEquals(2, BunnyEars.bunnyEars(1));
	}

	
	public static void case1() {
		  assertEquals(0, BunnyEars.bunnyEars(0));
	}

	
	public static void case8() {
		  assertEquals(100, BunnyEars.bunnyEars(50));
	}

	public static void main(String[] args) {
		case9();
		case7();
		case6();
		case5();
		case4();
		case3();
		case2();
		case1();
		case8();
	}
}
