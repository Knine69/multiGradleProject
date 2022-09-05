public class App {
    public static void main(String[] args) {

        String[] array = {"10", "22", "21", null, ""};
        for (String item : array) {
            System.out.print(item + " ");
        }

        System.out.println("\nArray items are all positive? " + new Utils().isAllPositiveNumbers(array));
    }
}
