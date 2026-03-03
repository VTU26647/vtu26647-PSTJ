import java.util.HashSet;
import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> set1 = new HashSet<>();
        for(int ele:nums){
            if(set1.contains(ele)){
                return true;
            }
            set1.add(ele);
        }
        return false;
    }
}

