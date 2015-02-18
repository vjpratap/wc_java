import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	String one = "hello, this is a good day.\r\nWhat do you think?\r\n";
	String two = "my name is vijay pratap singh.\r\nwhat is your name?";
	@Test
	public void test_that_function_getStringLength_give_the_number_of_character_of_the_string(){
		Wc w = new Wc(one,"one");
		assertEquals(48, w.getStringLength());
	}
	// @Test
	// public void test_that_function_getStringLength_give_the_number_of_character_of_the_string_two(){
	// 	Wc w = new Wc(two,"one");
	// 	assertEquals(48, w.getStringLength());
	// }

	@Test
	public void test_that_function_giveNumberOfWords_give_the_of_words_in_the_string(){
		Wc w = new Wc(one,"one");
		assertEquals(10, w.giveNumberOfWords());
	}
	@Test
	public void test_that_function_giveNumberOfLines_give_the_number_of_lines_in_the_string(){
		Wc w = new Wc(one,"one");
		assertEquals(2,w.giveNumberOfLines());	
	}
}