package strings;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String inputString = "Enter input string to be cleaned from white spaces";
        String stringWithoutSpaces = inputString.replaceAll("\\s+", "");
        System.out.println("Input String : "+inputString);
        System.out.println("Input String Without Spaces : "+stringWithoutSpaces);
    }
}
