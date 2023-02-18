package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String result = switch (number) {
            case 1, 2, 3, 4, 5 -> "number is between 1 and 5";
            case 6, 7, 8, 9, 10 -> "number is between 6 and 10";
            default -> "out of range";
        };
        System.out.println(result);
    }
}
