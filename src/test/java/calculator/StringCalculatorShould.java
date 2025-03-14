package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
	  StringCalculator stringCalculator = new StringCalculator();
    @Test
    void empty_string_should_return_0() {
        
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        
        assertEquals(1, stringCalculator.add("1"));
    }
    
    @Test
    void string_with_new_line_instedOf_commas() {
        
        assertEquals(6, stringCalculator.add("1\n2,3"));
    }
    
    @Test
    void string_with_new_delimiters_instedOf_commas() {
        
        assertEquals(3, stringCalculator.add("//;\n1;2"));
    }
    
    @Test
	public void shouldHaveNegativeNumbersInException() {
		try{
			stringCalculator.add("-1,-2,3");
			fail("Exception expected");
		}catch(RuntimeException e) {
			assertEquals("negatives not allowed: -1, -2",e.getMessage());
		}
	}
	
    @Test
    void string_with_number_greater_than_1000() {
        
        assertEquals(2, stringCalculator.add("2,1001"));
    }
	
}
