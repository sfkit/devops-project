package devops.numbers;

public class NumberWords {
	
	private final static String[] numbers = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
			                                  "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

	public String toWords( int number ) {
		String result = "" ;
		
		if ( number < 0 ) {
			result = "Number out of range";
		}
		else {
			result = numbers[number % 20];
		}
		
		return result.trim() ;
	}

}
