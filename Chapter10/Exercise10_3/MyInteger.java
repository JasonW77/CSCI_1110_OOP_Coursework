// Author Jason Waters
// Date 12/5/2019
// CSCI_1110_Assignment_10_3


public class MyInteger {
	
	private static int value = 0;
	
	public MyInteger(int value) {
		this.value = value;
	}
	public int getMyInteger() {
		return value;
	}
	
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		}	
		return false;
	}
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		}	
		return false;
	}
	public boolean isPrime() {
		for (int divisor = 2; divisor<= value / 2; divisor++) {
			if (value % divisor == 0 ) {
				return false;
			}
		}	
		return true;
	}
	public static boolean isIntEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isIntOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}	
		return false;
	}
	public static boolean isIntPrime(int value) {
		for (int divisor = 2; divisor<= value / 2; divisor++) {
			if (value % divisor == 0 ) {
				return false;
			}
		}
		return true;
	}
	public static boolean isMyEven(MyInteger value) {
		if (MyInteger.value % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isMyOdd(MyInteger value) {
		if (MyInteger.value % 2 != 0) {
			return true;
		}
		return false;
	}
	public static boolean isMyPrime(MyInteger value) {
		for (int divisor = 2; divisor<= MyInteger.value / 2; divisor++) {
			if (MyInteger.value % divisor == 0 ) {
				return true;
			}
		}
		return false;
	}
	public boolean equals(int value) {
		if (MyInteger.value == value) {
			return true;
		}
		return false;
	}
	public boolean equalsMy(int MyInteger) {
		if (MyInteger == value) {
			return true;
		}
		return false;
	}

	public static String parseInt(char []s) {
	
		return
	}
	/*public static void parseIntS() {
		
	}*/
}
