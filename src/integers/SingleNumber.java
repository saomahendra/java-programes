package integers;
import java.util.HashSet;
import java.util.Set;
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4,1,1,2,2};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    static int singleNumber2(int[] nums){
        int singleNumber = 0;
        for(int num : nums){
            singleNumber = singleNumber ^ num;
        }
        return singleNumber;
    }
    static int singleNumber(int[] nums){
        if(nums.length == 1)
            return nums[0];
        Set<Integer> setSN = new HashSet<>();
        for(int num : nums){
            if(setSN.contains(num)){
                setSN.remove(num);
            }
            else {
                setSN.add(num);
            }

        }
        return setSN.iterator().next();
    }
}
