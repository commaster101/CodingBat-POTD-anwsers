public class Test_Triangle extends GenericTestHarness
{
	
	public static void case4() {
		  assertEquals(6, Triangle.triangle(3));
	}

	
	public static void case3() {
		  assertEquals(3, Triangle.triangle(2));
	}

	
	public static void case2() {
		  assertEquals(1, Triangle.triangle(1));
	}

	
	public static void case1() {
		  assertEquals(0, Triangle.triangle(0));
	}

	
	public static void case7() {
		  assertEquals(21, Triangle.triangle(6));
	}

	
	public static void case8() {
		  assertEquals(28, Triangle.triangle(7));
	}

	
	public static void case6() {
		  assertEquals(15, Triangle.triangle(5));
	}

	
	public static void case5() {
		  assertEquals(10, Triangle.triangle(4));
	}

	public static void main(String[] args) {
		case4();
		case3();
		case2();
		case1();
		case7();
		case8();
		case6();
		case5();
	}
}
