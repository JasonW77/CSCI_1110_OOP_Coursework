public class MyIntegerObject {
	
	public static void main(String args[]) {
		
		//Constructor
		MyInteger def = new MyInteger(5);
		
		int testing = 5;
		
		//getter method
		System.out.println("getMyInteger: " + def.getMyInteger());
		
		//isEven() method
		System.out.println("isEven: " + def.isEven());
		
		//isOdd() method
		System.out.println("isOdd: " + def.isOdd());
				
		//isPrime() method
		System.out.println("isPrime: " + def.isPrime());
		
		//isEven(int) method static
		System.out.println("isEven("+ testing + "): " + MyInteger.isIntEven(testing));
		
		//isOdd(int) method static
		System.out.println("isOdd("+ testing + "): " + MyInteger.isIntOdd(testing));
		
		//isPrime(int) method static
		System.out.println("isPrime("+ testing + "): " + MyInteger.isIntPrime(testing));
		

		//isEven(MyInteger) method static
		System.out.println("isEven(MyInteger): " + MyInteger.isMyEven(def));
		
		//isOdd(MyInteger) method static
		System.out.println("isOdd(MyInteger): " + MyInteger.isMyOdd(def));
		
		//isPrime(MyInteger) method static
		System.out.println("isPrime(MyInteger): " + MyInteger.isMyPrime(def));
		
		//equals(int) method
		System.out.println("equals("+ testing + "): "  + def.equals(testing));
		
		//equals(MyInteger) method
		System.out.println("equals(MyInteger): " + def.equalsMy(testing));
		
		//parseInt(char[]) method
		String[] s = {"1","2","3"};
		
		System.out.println(parseInt[s]);
	
		
		//parseInt(String) method
		//System.out.println("parseInt(String): " + MyInteger.parseInt(def));
		
	}
}
