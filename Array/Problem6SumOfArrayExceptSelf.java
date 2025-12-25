import java.util.Arrays;

public class Problem6SumOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(sumExceptSelf(arr)));
    }

    private static int[] sumExceptSelf(int[] arr) {
        int[] result = new int[arr.length];
        int pre = 1, post = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = pre;
            pre = pre * arr[i];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = result[i] * post;
            post = post * arr[i];
        }
        return result;
    }
}
