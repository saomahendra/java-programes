package integers;

public class CheckArmstrongNumber {

    public static void main(String[] args) {
        int number = 153;
        checkArmstrongNumber(number);
    }

    static void checkArmstrongNumber(int number){

        int numOfDigit = String.valueOf(number).length();
        int copyOfNumber = number;
        int sum = 0;
        while (copyOfNumber != 0){
            int lastDigit = copyOfNumber%10;
            int lastDigitToThePowerNumOfDigit = 1;
            for(int i=0; i<numOfDigit; i++){
                lastDigitToThePowerNumOfDigit = lastDigitToThePowerNumOfDigit * lastDigit;
            }
            sum = sum + lastDigitToThePowerNumOfDigit;
            copyOfNumber = copyOfNumber/10;
        }

        if (sum == number)
        {
            System.out.println(number+" is an armstrong number");
        }
        else
        {
            System.out.println(number+" is not an armstrong number");
        }
    }
}
