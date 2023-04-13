package assignmenttt;

public class TenthPermutations {


    public static void main(String[] args) {
        String str = "vel";
        generatePermutations(str.toCharArray(), 0, str.length() - 1);
    }

    public static void generatePermutations(char[] arr, int left, int right) {
        if (left == right) {
            System.out.println(new String(arr));
        } else {
            for (int i = left; i <= right; i++) {
                swap(arr, left, i);
                generatePermutations(arr, left + 1, right);
                swap(arr, left, i);
            }
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

