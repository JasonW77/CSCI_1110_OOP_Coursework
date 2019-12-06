// Author Jason Waters
// Date 12/5/2019
// CSCI_1110_Assignment_10_3


public class MyInteger {
	
	private static int value = 0;
	
	public MyInteger() {
		this.value = value;
	}
	
	public int getMyInteger() {
		System.out.println(value);
		return value;
	}
	
	public boolean isEven() {
		boolean iseven = true;
		if (value % 2 == 0) {
			iseven = true;
		}
		else if (value % 2 != 0) {
			iseven = false;
		}
		return iseven;
	}
	
	public boolean isOdd() {
		boolean isodd = true;
		if (value % 2 == 0) {
			isodd = false;
		}
		else if (value % 2 != 0) {
			isodd = true;
		}
		return isodd;
	}
	
	public boolean isPrime() {
		boolean isprime = true;
		if (value % 2 == 0) {
			isprime = false;
		}
		else if (value % 2 != 0) {
			isprime = true;
		}
		return isprime;
	}
	
	public static boolean isIntEven(int value) {
		boolean iseven = true;
		if (value % 2 == 0) {
			iseven = true;
		}
		else if (value % 2 != 0) {
			iseven = false;
		}
		return iseven;
	}
	
	public static boolean isIntOdd(int value) {
		boolean isodd = true;
		if (value % 2 == 0) {
			isodd = false;
		}
		else if (value % 2 != 0) {
			isodd = true;
		}
		return isodd;
	}
	
	public static boolean isIntPrime(int value) {
		boolean isprime = true;
		if (value % 2 == 0) {
			isprime = false;
		}
		else if (value % 2 != 0) {
			isprime = true;
		}
		return isprime;
	}
	
	public static boolean isMyEven(MyInteger value) {
		boolean iseven = true;
		if (MyInteger.value % 2 == 0) {
			iseven = true;
		}
		else if (MyInteger.value % 2 != 0) {
			iseven = false;
		}
		return iseven;
	}
	
	public static boolean isMyOdd(MyInteger value) {
		boolean isodd = true;
		if (MyInteger.value % 2 == 0) {
			isodd = false;
		}
		else if (MyInteger.value % 2 != 0) {
			isodd = true;
		}
		return isodd;
	}
	
	public static boolean isMyPrime(MyInteger value) {
		boolean isprime = true;
		if (MyInteger.value % 2 == 0) {
			isprime = false;
		}
		else if (MyInteger.value % 2 != 0) {
			isprime = true;
		}
		return isprime;
	}
	
	public boolean equals(int value) {
		boolean equals = true;
		
		return equals;
	}
	
	public boolean equalsMy(int MyInteger) {
		boolean equalsMy = true;
		
		return equalsMy;
	}
	
	//public static void parseIntC(char[]) {
		
	//}
	
	//public static void parseIntS() {
		
	//}

}
