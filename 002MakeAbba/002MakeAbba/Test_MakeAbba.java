public class Test_MakeAbba extends GenericTestHarness
{
	
	public static void case8() {
		  assertEquals("BoYaYaBo", MakeAbba.makeAbba("Bo", "Ya"));
	}

	
	public static void case9() {
		  assertEquals("YaYaYaYa", MakeAbba.makeAbba("Ya", "Ya"));
	}

	
	public static void case7() {
		  assertEquals("yy", MakeAbba.makeAbba("", "y"));
	}

	
	public static void case5() {
		  assertEquals("xyyx", MakeAbba.makeAbba("x", "y"));
	}

	
	public static void case1() {
		  assertEquals("HiByeByeHi", MakeAbba.makeAbba("Hi", "Bye"));
	}

	
	public static void case6() {
		  assertEquals("xx", MakeAbba.makeAbba("x", ""));
	}

	
	public static void case2() {
		  assertEquals("YoAliceAliceYo", MakeAbba.makeAbba("Yo", "Alice"));
	}

	
	public static void case4() {
		  assertEquals("aaabbbbbbaaa", MakeAbba.makeAbba("aaa", "bbb"));
	}

	
	public static void case3() {
		  assertEquals("WhatUpUpWhat", MakeAbba.makeAbba("What", "Up"));
	}

	public static void main(String[] args) {
		case8();
		case9();
		case7();
		case5();
		case1();
		case6();
		case2();
		case4();
		case3();
	}
}
