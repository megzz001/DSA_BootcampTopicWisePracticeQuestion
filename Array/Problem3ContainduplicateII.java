import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem3ContainduplicateII {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,6,3,6,3,1};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(containsNearbyDuplicate(arr, k));
        sc.close();
    }

    private static boolean containsNearbyDuplicate(int[] arr, int k) {
        // TODO Auto-generated method stub
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< arr.length; i++){
            if(i > k){
                set.remove(arr[i - k - 1]);
            }
            if(!set.add(arr[i])){
                return true;
            }
        }
        return false;
    }
}
