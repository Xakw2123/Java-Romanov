public class Тhird {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printOddNumbers(arr);
    }

    public static void printOddNumbers(int[] arr) {
        int q = 0;
        System.out.println();
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 2 != 1) {
                if (q != 0) System.out.print(",");
                System.out.print(arr[x]);
                q = 1;
            }

        }
        System.out.println();
    }
}
