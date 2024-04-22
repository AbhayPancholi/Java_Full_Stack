public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {5, 3, 6, 8, 7, 3, 6, 5};
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element found: " + arr[i]);
                }
            }
        }
    }
}
