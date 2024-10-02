package WeekFour;

public class IterationsExample {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Something");

            System.out.println(count);
            ++count;
            System.out.println(count);
        }
    }
}
