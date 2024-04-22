package strings;
import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str = "Hello World";
        int count = 1;
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = str.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char is not present in charCountMap,
                //putting this char to charCountMap with 1 as it's value
                charCountMap.put(c, 1);
            }
        }
//Getting a Set containing all keys of charCountMap
        Set<Character> charsInString = charCountMap.keySet();
        System.out.println("Duplicate Characters In "+ str);
//Iterating through Set 'charsInString'
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                //If any char has a count of more than 1, printing it's count
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
        // for(Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
        //     System.out.println(entry.getKey() +" " + entry.getValue());
        // }
    }
}
