package ss9.bai_tap.tinh_ket_qua_fizz_buzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTranslateTest {
    @Test
    public void divisibleBy3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void divisibleBy5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void divisibleBy3add5() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void numberHave3InUnitRow(){
        int number = 23;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void numberHave3InDozens(){
        int number = 31;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void numberHave5InUnitRow(){
        int number = 25;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void numberHave5InDozens(){
        int number = 58;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }
    @Test
    public void notASpecialNumber(){
        int number = 26;
        String expected = "hai sau";
        String result = FizzBuzzTranslate.translateNumber(number);
        assertEquals(expected, result);
    }


}
