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



}
