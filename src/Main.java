public class Main {

    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.abs.apply(-2);
        int c = calculator.multiply.apply(a, b);

        calculator.println.accept(c);

        // В задании надо объяснить почему код не работает.
        //Но у меня код работает((


    }
}
