package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void numberReturnsOne() {
		Assert.assertEquals( "One", numberWords.toWords( 1 ) ) ;
	}
	
	@Test
	public void numberReturnsFive() {
		Assert.assertEquals( "Five", numberWords.toWords( 5 ) ) ;
	}

	@Test
	public void numberReturnsTen() {
		Assert.assertEquals( "Ten", numberWords.toWords( 10 ) ) ;
	}
	
	@Test
	public void numberReturnsNineteen() {
		Assert.assertEquals( "Nineteen", numberWords.toWords( 19 ) ) ;
	}
	
	@Test
	public void numberReturnsTwenty() {
		Assert.assertEquals( "Twenty", numberWords.toWords( 20 ) ) ;
	}
	
	@Test
	public void numberReturnsNinetyNine() {
		Assert.assertEquals( "Ninety Nine", numberWords.toWords( 99 ) ) ;
	}
	
	@Test
	public void numberReturnsHundred() {
		Assert.assertEquals( "One Hundred", numberWords.toWords( 100 ) ) ;
	}
	
	@Test
	public void numberReturnsTwoHundredAndFifty() {
		Assert.assertEquals( "Two Hundred and Fifty", numberWords.toWords( 250 ) ) ;
	}
	
	@Test
	public void numberReturnsFiveHundredAndFortyFive() {
		Assert.assertEquals( "Five Hundred and Forty Five", numberWords.toWords( 545 ) ) ;
	}
	
	@Test
	public void numberReturnsNineHundredAndNinetyNine() {
		Assert.assertEquals( "Nine Hundred and Ninety Nine", numberWords.toWords( 999 ) ) ;
	}
	
	



}
