import org.jhuguet.utils.Utils;

public class Main {
    public static void main(String[] args) {
        /*
            String[] array = {"10", "1", "-112", "22", "21"};
            for (String item : array) {
                System.out.print(item + " ");
            }
        */
        System.out.print("10 1 -112 22 21");
        System.out.println("\nArray items are all positive: " + new Utils().isAllPositiveNumbers("10", "1", "-112", "22", "21"));
    }
}
