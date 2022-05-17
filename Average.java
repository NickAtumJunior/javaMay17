import java.util.Scanner;

public class Average {
    int sum;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many values in an array");

        int a = sc.nextInt();

        int _array[] = new int[a];

        System.out.println("Enter the elements");

        int sum = 0;

        for (int i = 0; i < a; i++) {

            int value = sc.nextInt();

            _array[i] = value;
        }

        int length = _array.length;

        for (int i = 0; i < _array.length; i++) {

            sum += _array[i];
        }

        double average = sum / length;

        System.out.println("Average of an given array is : " + average);
    }
}
