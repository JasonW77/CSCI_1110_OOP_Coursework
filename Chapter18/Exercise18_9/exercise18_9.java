//Author Jason Waters
//Date 2/11/2020
//CSCI_1110_Exercise_18_9


public class exercise18_9 {
	public static void main(String[] args) {
		
		String ori = "Original Stringster!";
		
		reverseDisplay(ori);
		
	}
	public static void reverseDisplay(String value) {
		if (value.length() == 1)
			System.out.println(value);
		else {
			System.out.print(value.charAt(value.length() - 1));
			reverseDisplay(value.substring(0, value.length() - 1));
		}
	}
}
