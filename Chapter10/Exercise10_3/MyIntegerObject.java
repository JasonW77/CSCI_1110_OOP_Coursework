
public class MyIntegerObject {
	
	public static void main(String args[]) {
		
		//Constructor
		MyInteger def = new MyInteger(5);
		
		int testing = 100;
		
		//getter method
		def.getMyInteger();
		
		//isEven() method
		def.isEven();
		
		//isPrime() method
		def.isPrime();
		
		//isOdd() method
		def.isOdd();
		
		//isEven(int) method static
		MyInteger.isIntEven(testing);
		
		//isPrime(int) method static
		MyInteger.isIntPrime(89);
		
		//isOdd(int) method static
		MyInteger.isIntOdd(53);
		
		//isEven(MyInteger) method static
		MyInteger.isMyEven(def);
		
		//isPrime(MyInteger) method static
		MyInteger.isMyPrime(def);
		
		//isOdd(MyInteger) method static
		MyInteger.isMyOdd(def);
		
		//equals(int) method
		
		//equals(MyInteger) method
		
		//parseInt(char[]) method
		
		//parseInt(String) method
		
		
	}
}
