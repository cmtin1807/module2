package ss9.bai_tap.tinh_ket_qua_fizz_buzz;

public class FizzBuzzTranslate {
    public static String translateNumber(int number){
        if(number % 15 == 0){
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
        if(number % 10 == 3){
            return "Fizz";
        }
        if(((int) number/10) == 3){
            return "Fizz";
        }
        if(number % 10 == 5){
            return "Buzz";
        }
        if(((int) number/10) == 5){
            return "Buzz";
        }
        return translate(number);
    }
    public static String translate(int number){
        String[]unit = {"khong","mot","hai","ba","bon","nam","sau","bay","tam","chin"};
        if (number<10){
            return unit[number];
        }
        else {
            return unit[number/10]+" "+unit[number%10];
        }
    }
}
