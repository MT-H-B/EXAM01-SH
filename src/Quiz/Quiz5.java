package Quiz;

public class Quiz5 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 26, 32};
        reverseArray(arr);
    }
    public static void reverseArray(int[] intArray) {
        for(int i=intArray.length-1; i>=0; i--) {
            System.out.print(intArray[i] + " ");
        }
    }
}
