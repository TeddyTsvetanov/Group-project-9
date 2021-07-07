package b22Group9.Ramin_is_here;

public class Printing0to100Arrays {
    public static void main(String[] args) {
        int []numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }

        for (int each : numbers) {
            System.out.print(each+" ");
        }
    }
}
