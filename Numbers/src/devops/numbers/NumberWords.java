package devops.numbers;

public class NumberWords {
	
	private final static String[] numbers = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
			                                  "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final static String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

	public String toWords( int number ) {
		String result = "" ;
		
		if ( ( number < 0 ) || ( number > 999 ) ){
			result = "Number out of range";
			return result.trim();
		}
		else {
			
            if ( (number % 100 < 20) && (number < 100) ) {

    			result = numbers[number % 100];
    			number /= 100;
    			return result.trim();
            }
            else {
            	result = numbers[number % 10];
            	number /= 10;
            	result = tens[number % 10] + " " + result;
            	number /= 10;
            	
            	if (number == 0) return result.trim();
            	if ( result.length() == 1 ) return ( numbers[number] + " Hundred" ).trim();
            	
            	return ( numbers[number] + " Hundred and " + result ).trim();
            } 
			
		}
			
	}

}
