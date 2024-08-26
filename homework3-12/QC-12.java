import java.util.Scanner;
import java.lang.Math;

public class Main {
    static long maxNumberInArr(long[] arr) {
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static double averageNumberInArr(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }

    static long minNumberInArr(long[] arr) {
        long min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static long findNumberInArr(long[] arr, long x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i + 1;
            }
        }
        return -1;
    }

    static boolean isPrime(long num) {
        if (num <= 1) return false;
        for (long i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    static long MaxPrimeNumberInArr(long[] arr) {
        long max = -1;
        for (long num : arr) {
            if (isPrime(num) && num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        if (n == 0 || n > 30) {
            return;
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
        }
        long x = sc.nextLong();
        System.out.println("a. " + maxNumberInArr(arr));
        System.out.println("b. " + averageNumberInArr(arr));
        System.out.println("c. " + minNumberInArr(arr));
        System.out.println("d. " + findNumberInArr(arr, x));
        System.out.println("e. " + MaxPrimeNumberInArr(arr));

    }
}