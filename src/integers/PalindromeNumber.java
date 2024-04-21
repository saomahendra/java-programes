package integers;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(12215));
    }

    static boolean isPalindromeNumber(int num){
        int reverse = 0;
        if(num < 0 ) return  false;
        while(num > reverse ){
           int lastDigit = num % 10 ;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        return num == reverse || num ==reverse/10 ;
    }
}
