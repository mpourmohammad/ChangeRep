public class User implements Cloneable, TextCalculator {

    public static <T, V> void print(T key, V value) {
        System.out.println(key + " = " + value);
    }

    @Override
    public double calculate(String text) {
        return 0;
    }

    @Override
    public double calculate(String text, int num) {
        return 0;
    }

    @Override
    public double calculate(String text, double num) {
        return 0;
    }
}
