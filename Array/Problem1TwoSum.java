import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Problem1TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //Create a HashMap to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        //Iterate through the array
        for(int i = 0 ; i < nums.length ; i++){
            //Calculate the complement of the current number
            int complement = target - nums[i];

            //Check if the complement is already in the map 
            if(map.containsKey(complement)){
                //If found , return the indices of the complement and the current number 
                return new int[] {map.get(complement),i};
            }
            //Otherwise , add the current number and its index to the map
                map.put(nums[i],i);
        }
//Return the empty array if no solution is found (this case won't occur as per constraints)
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {2,7,11,15};
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int[] result = twoSum(nums, target);
        
        if(result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}
        
