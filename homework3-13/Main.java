import java.util.Scanner;

public class Main {

    static double findHighPointsInClass(double[] arr, int n) {
        if (n <= 0) return Double.MIN_VALUE;
        double max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int[] findStudentsWithHighPoints(double[] arr, int n) {
        double maxPoints = findHighPointsInClass(arr, n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxPoints) {
                count++;
            }
        }
        int[] students = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == maxPoints) {
                students[index++] = i + 1;
            }
        }
        return students;
    }

    static double findLowPointsInClass(double[] arr, int n) {
        if (n <= 0) return Double.MAX_VALUE;
        double min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int[] findStudentsWithLowPoints(double[] arr, int n) {
        double minPoints = findLowPointsInClass(arr, n);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == minPoints) {
                count++;
            }
        }
        int[] students = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == minPoints) {
                students[index++] = i + 1;
            }
        }
        return students;
    }

    static double[] findTop3Points(double[] arr) {
        double first = Double.MIN_VALUE, second = Double.MIN_VALUE, third = Double.MIN_VALUE;
        for (double points : arr) {
            if (points > first) {
                third = second;
                second = first;
                first = points;
            } else if (points > second) {
                third = second;
                second = points;
            } else if (points > third) {
                third = points;
            }
        }
        return new double[]{first, second, third};
    }

    static int[] findTop3StudentsWithHighPoints(double[] arr) {
        double[] top3Points = findTop3Points(arr);
        int[] top3Students = new int[3];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == top3Points[0] || arr[i] == top3Points[1] || arr[i] == top3Points[2]) {
                top3Students[index++] = i + 1;
                if (index == 3) break;
            }
        }
        return top3Students;
    }

    static double findAveragePoints(double[] arr, int n) {
        if (n <= 0) return 0;
        double sum = 0;
        for (double points : arr) {
            sum += points;
        }
        return sum / n;
    }

    static int[] findStudentsWithAveragePoints(double[] arr, int n) {
        double averagePoints = findAveragePoints(arr, n);
        int count = 0;
        for (double points : arr) {
            if (points == averagePoints) {
                count++;
            }
        }
        int[] students = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == averagePoints) {
                students[index++] = i + 1;
            }
        }
        return students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        int[] studentsWithHighPoints = findStudentsWithHighPoints(arr, n);
        System.out.print("a: ");
        for (int student : studentsWithHighPoints) {
            System.out.print(student + " ");
        }
        System.out.println();

        int[] studentsWithLowPoints = findStudentsWithLowPoints(arr, n);
        System.out.print("b: ");
        for (int student : studentsWithLowPoints) {
            System.out.print(student + " ");
        }
        System.out.println();

        int[] top3Students = findTop3StudentsWithHighPoints(arr);
        System.out.print("c: ");
        for (int student : top3Students) {
            System.out.print(student + " ");
        }
        System.out.println();

        int[] studentsWithAveragePoints = findStudentsWithAveragePoints(arr, n);
        System.out.print("d: ");
        for (int student : studentsWithAveragePoints) {
            System.out.print(student + " ");
        }
        System.out.println();
    }
}