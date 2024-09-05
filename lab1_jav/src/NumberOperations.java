import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class NumberOperations {
    public static void main(String[] args) {
        // Підготовка
        ArrayList<Number> numberList = new ArrayList<Number>(
                Arrays.asList(10, 20.5, 30, 40.7, 50, 60.3, 70, 80.1, 90, 100.9)
        );
        // Завдання1
        byte byteNum = 1;
        short shortNum = 27;
        int intNum = 73;
        long longNum = 123456789L;
        float floatNum = 1.618f;
        double doubleNum = 24.593;
        // Завдання 2 і 3
        numberList.addAll(Arrays.asList(byteNum, shortNum, intNum, longNum, floatNum, doubleNum));
        // Завдання4
        System.out.println("Оригінальний масив:" + numberList);
        // Завдання5
        ArrayList<Long> intNumberList = new ArrayList<Long>();
        for (Number num : numberList){
            long roundedNum = Math.round(num.doubleValue());
            intNumberList.add(roundedNum);
        }
        System.out.println("Масив цілих чисел:" + intNumberList);
        // Завдання6
        System.out.print("Масив дробових чисел: [");
        for (Number num : numberList) {
            System.out.printf("%.2f", num.doubleValue());
            System.out.print(" ");
        }
        System.out.println("]");
        // Завдання7
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Byte> byteList = new ArrayList<Byte>();
        ArrayList<Short> shortList = new ArrayList<Short>();
        ArrayList<Long> longList = new ArrayList<Long>();
        ArrayList<Float> floatList = new ArrayList<Float>();
        ArrayList<Double> doubleList = new ArrayList<Double>();

        for (Number num : numberList) {
            if (num instanceof Integer) {
                intList.add((int) num);
            } else if (num instanceof Byte) {
                byteList.add((byte) num);
            } else if (num instanceof Short) {
                shortList.add((short) num);
            } else if (num instanceof Long) {
                longList.add((long) num);
            } else if (num instanceof Float) {
                floatList.add((float) num);
            } else if (num instanceof Double) {
                doubleList.add((double) num);
            } else {
                continue;
            }
        }
        System.out.println("Масив Int: " + intList);
        System.out.println("Масив Byte: " + byteList);
        System.out.println("Масив Short: " + shortList);
        System.out.println("Масив Long: " + longList);
        System.out.println("Масив Float: " + floatList);
        System.out.println("Масив Double: " + doubleList);
        // Завдання по варіантам(8)
        double sum = 0;
        for (Number num : numberList) {
            if (num.doubleValue() > 50) {
                sum += num.doubleValue();
            }
        }
        System.out.println("Сума чисел більших за 50: " + sum);
    }
}
