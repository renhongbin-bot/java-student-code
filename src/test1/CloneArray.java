package test1;

public class CloneArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] copyArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }



        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }
    }
}
