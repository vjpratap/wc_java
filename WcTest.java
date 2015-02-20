import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{
	String one = "hello, this is a good day.\r\nWhat do you think?\r\n";
	String two = "my name is vijay pratap singh.\r\nwhat is your name?";
	@Test
	public void test_that_function_getStringLength_give_the_number_of_character_of_the_string(){
		Wc w = new Wc(one,"one",null);
		assertEquals("48", w.getStringLength());
	}
	@Test
	public void test_that_function_getStringLength_give_the_number_of_character_of_the_string_two(){
		Wc w = new Wc(two,"one",null);
		assertEquals("50", w.getStringLength());
	}
	@Test
	public void test_that_function_giveNumberOfWords_give_the_of_words_in_the_string(){
		Wc w = new Wc(one,"one",null);
		assertEquals("10", w.giveNumberOfWords());
	}
	@Test
	public void test_that_function_giveNumberOfWords_give_the_of_words_in_the_string_for_two(){
		Wc w = new Wc(two,"one",null);
		assertEquals("10", w.giveNumberOfWords());
	}
	@Test
	public void test_that_function_giveNumberOfLines_give_the_number_of_lines_in_the_string(){
		Wc w = new Wc(one,"one",null);
		assertEquals("2",w.giveNumberOfLines());	
	}
	@Test
	public void test_that_function_giveNumberOfLines_give_the_number_of_lines_in_the_string_two(){
		Wc w = new Wc(two,"one",null);
		assertEquals("2",w.giveNumberOfLines());	
	}
	@Test
	public void test_that_function_giveMaxLineInString_give_the_number_chars_and_text_of_the_maximum_line(){
		Wc w = new Wc(one, "one",null);
		assertEquals("27 hello, this is a good day.",w.giveMaximumLineInString());
	}
	@Test
	public void test_that_function_giveMaxLineInString_give_the_number_chars_and_text_of_the_maximum_line_for_two(){
		Wc w = new Wc(two, "one",null);
		assertEquals("31 my name is vijay pratap singh.",w.giveMaximumLineInString());
	}
	@Test
	public void test_that_function_giveManimunLineInString_give_the_number_of_chars_and_text_of_the_minimum_lines(){
		Wc w = new Wc(one, "one", null);
		assertEquals("19 What do you think?", w.giveManimunLineInString());
	}
	@Test
	public void test_that_function_giveManimunLineInString_give_the_number_of_chars_and_text_of_the_minimum_lines_for_two(){
		Wc w = new Wc(two, "one", null);
		assertEquals("19 what is your name?", w.giveManimunLineInString());
	}
}



