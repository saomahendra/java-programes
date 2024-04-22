package strings;

public class ReverseString {

    public static void main(String[] args) {
        // String str = "Hello";
        //char[] charAr = str.toCharArray();
        char[] charAr = reverseString("Hello".toCharArray());
        System.out.println(charAr);

    }

    static char[] reverseString(char[] charArr) {

        int left = 0;
        int right = charArr.length - 1;
        while (left < right){
            char temp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] =  temp;
            left++;
            right--;
        }
        return charArr;
    }
}
