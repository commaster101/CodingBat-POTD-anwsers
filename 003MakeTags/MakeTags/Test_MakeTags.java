public class Test_MakeTags extends GenericTestHarness
{
	
	public static void case2() {
		  assertEquals(MakeTags.makeTags("i", "Hello"), "<i>Hello</i>");
	}

	
	public static void case7() {
		  assertEquals(MakeTags.makeTags("i", ""), "<i></i>");
	}

	
	public static void case6() {
		  assertEquals(MakeTags.makeTags("i", "i"), "<i>i</i>");
	}

	
	public static void case5() {
		  assertEquals(MakeTags.makeTags("body", "Heart"), "<body>Heart</body>");
	}

	
	public static void case4() {
		  assertEquals(MakeTags.makeTags("address", "here"), "<address>here</address>");
	}

	
	public static void case3() {
		  assertEquals(MakeTags.makeTags("cite", "Yay"), "<cite>Yay</cite>");
	}

	
	public static void case1() {
		  assertEquals(MakeTags.makeTags("i", "Yay"), "<i>Yay</i>");
	}

	public static void main(String[] args) {
		case2();
		case7();
		case6();
		case5();
		case4();
		case3();
		case1();
	}
}
