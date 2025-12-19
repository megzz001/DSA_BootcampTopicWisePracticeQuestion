import java.util.Arrays;
import java.util.HashSet;

public class Problem2ContainsDuplicate {

    public static Boolean checkDuplicate(int[] nums) {

        // ---------------------------------Brute Force Approach---------------------------------
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // return true;
        // }
        // }
        // }
        // return false;

        // -------------------------------Optimal Approach---------------------------------
        // First we will sort the array in ascending order and then check the adjacent element if they are similar

        /*Arrays.sort(nums);
        for(int i = 0; i< nums.length -1 ; i++){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;*/

        // -------------------------------Optimal Approach Using HashSet---------------------------------
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }     
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 6, 7, 1, 2 };
        int[] arr = { 1, 2, 3, 4, 5 };
        Boolean res = checkDuplicate(nums);
        if (res == true) {
            System.out.println("The Array contains duplicate elements");
        } else {
            System.out.println("The array doesn't contain any duplicate elements");
        }
        Boolean res2 = checkDuplicate(arr);
        if (res2 == true) { 
            System.out.println("The Array contains duplicate elements");
        } else {
            System.out.println("The array doesn't contain any duplicate elements");
        }
    }
}
