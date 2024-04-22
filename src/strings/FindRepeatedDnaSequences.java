package strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindRepeatedDnaSequences {
    public static void main(String[] args) {
        String str = "AAAAACCCCCDDAAAAACCCCCCCDD";

        List<String> strList = findRepeatedDnaSequences2(str);
        System.out.println(strList);
    }

    static List<String> findRepeatedDnaSequences2(String str){
        Set<String> set = new HashSet<>();
        Set<String> resultSet = new HashSet<>();
        for(int i=0; i<=str.length() - 10; i++ ){
            String subStr = str.substring(i, i+10);
            if(set.contains(subStr)){
                resultSet.add(subStr) ;
            }
            else{
                set.add(subStr);
            }
        }

        return (new ArrayList(resultSet));
    }

    static List<String> findRepeatedDnaSequences(String strDNA){
        Map<String, Integer> mapDNA = new HashMap<>();
        for (int i=0; i <= strDNA.length() - 10 ; i++){
            String subStr = strDNA.substring(i, i +10);
            mapDNA.put(subStr, mapDNA.getOrDefault(subStr, 0) + 1);
        }
        List<String> strList = new ArrayList<>();
        for(Map.Entry<String, Integer> item : mapDNA.entrySet()){
            if(item.getValue() > 1){
                strList.add(item.getKey());
            }

        }
        return strList;
    }
}
