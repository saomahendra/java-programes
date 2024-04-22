package integers;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int number = 123;
        sumOfAllDigits(number);
    }

    static void sumOfAllDigits(int number) {
        //int copyOfNum = number;
        int sum =0;
        while(number != 0){
            int lastDigit = number % 10;
            sum = sum + lastDigit;
            number = number / 10;
        }
        System.out.println("sum of digits: " + sum);
    }

}
