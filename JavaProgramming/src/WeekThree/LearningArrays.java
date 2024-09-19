package WeekThree;

public class LearningArrays {
    public static double addAllNums(double[] lst) {
        double sum = 0.0;

        // foreach loop type
        for (double val : lst) {
            sum += val; // sum = sum + val
            System.out.printf("The current value of sum is: %.2f%n", sum);
        }

        System.out.printf("The final value of sum is: %.2f%n", sum);

        return sum;
    }
    public static void main(String[] args) {
        // Integer array called arr
        // size of arr is 5
        double[] arr = { 1.0, 2.0, 3.0, 4.0, 5.0, 8.0, 20.0 };

        // Call addAllNums method and pass arr list of double values to be summed
        addAllNums(arr);

        // We want to iterate through the list
        // We will use a for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("the index is:%d... the value is:%.2f%n", i, arr[i]);
        }
    }
}
