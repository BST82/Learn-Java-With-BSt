import java.util.*;

class HelloWorld {

    public int arraysum(int[] arr1, int[] arr2) {

        int sum1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 = sum1 + arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            sum1 = sum1 + arr1[i];
        }
        return sum1;
    }

    public int findMin(int[] arr1) {

        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] < arr1[i - 1]) {
                min = arr1[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.print("Enter size of arra1: ");
        int n;
        int m;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();

            System.out.print("Enter elements of arra1: ");
            int arr1[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            System.out.print("\nElements of arra1: ");
            for (int i : arr1) {
                System.out.print(i + " ");
            }

            System.out.print("\nEnter size of arra2: ");
            m = sc.nextInt();
            System.out.print("\nEnter elements of arra1: ");
            int arr2[] = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            System.out.print("\nElements of arra1: ");
            for (int i = 0; i < m; i++) {
                System.out.print(arr2[i] + " ");
            }

            HelloWorld object = new HelloWorld();
            System.out.print("\nSum of array1 and array2 is : " + object.arraysum(arr1, arr2));

            System.out.print("\nMinimum element in an Array1 is : " + object.findMin(arr1) + "\n");
        }
    }
}
