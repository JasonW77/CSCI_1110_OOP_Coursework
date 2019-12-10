package chapter10;

//Author Jason Waters
//Date 12/5/2019
//CSCI_1110_Assignment_10_3


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
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(int value) {
		if (value % 2 != 0) {
			return true;
		}	
		return false;
	}
	public static boolean isPrime(int value) {
		for (int divisor = 2; divisor<= value / 2; divisor++) {
			if (value % divisor == 0 ) {
				return false;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger value) {
		if (MyInteger.value % 2 == 0) {
			return true;
		}
		return false;
	}
	public static boolean isOdd(MyInteger value) {
		if (MyInteger.value % 2 != 0) {
			return true;
		}
		return false;
	}
	public static boolean isPrime(MyInteger value) {
		for (int divisor = 2; divisor<= MyInteger.value / 2; divisor++) {
			if (MyInteger.value % divisor == 0 ) {
				return true;
			}
		}
		return false;
	}
	public boolean equals() {
		if ( this.value == MyInteger.value) {
			return true;
		}
		return false;
	}
	public static boolean equals(int MyInteger) {
		if (MyInteger == value) {
			return true;
		}
		return false;
	}
	public static int parseInt(char[] charArray){  
		int ret = 0;
	    for(int i = 0; i < charArray.length; i++) {
	          ret = ret * 10 + (charArray[i] - '0');
	    }
	    return ret;
	}
	public static int parseInt(String hex) {
		int ret = 0;
		for(int i = 0; i < hex.length(); i++) {
	          ret = ret * 10 + (hex.charAt(i) - '0');
	    }
	    return ret;
	}
}
