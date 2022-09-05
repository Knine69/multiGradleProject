import demo.StringUtils;

public class Utils {
    private final StringUtils utils = new StringUtils();

    public String isAllPositiveNumbers(String... parameters) {
        for (String param : parameters) {
            if (!utils.checkIfNumber(param)) return "There are incorrect values in array e.g. Not numbers";
            if (!utils.isPositiveNumber(param)) return "There are negative numbers in array";
        }
        return "All numbers are positive";
    }
}