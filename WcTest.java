import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	String one = "hello, this is a good day.\r\nWhat do you think?\r\n";
	String two = "my name is vijay pratap singh.\r\nwhat is your name?";
	@Test
	public void test_that_function_getStringLength_give_the_number_of_character_of_the_string(){
		Wc w = new Wc(one);
		// assertEquals(5, w.getStringLength("vijay"));
		// assertEquals(0, w.getStringLength(""));
		assertEquals(48, w.getStringLength(one));
		// assertEquals(50, w.getStringLength(two));
	}
	@Test
	public void test_that_function_giveNumberOfWords_give_the_of_words_in_the_string(){
		Wc w = new Wc(one);
		// assertEquals(1, w.giveNumberOfWords("vijay"));
		assertEquals(10, w.giveNumberOfWords(one));
		// assertEquals(10, w.giveNumberOfWords(two));
	}
	@Test
	public void test_that_function_giveNumberOfLines_give_the_number_of_lines_in_the_string(){
		Wc w = new Wc(one);
		assertEquals(2,w.giveNumberOfLines(one));	
		// assertEquals(1,w.giveNumberOfLines("vijay"));
		// assertEquals(2,w.giveNumberOfLines(two));
	}
}