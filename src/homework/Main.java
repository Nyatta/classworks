package homework;

import homework.calcs.CalculatorWithExtends;
import homework.calcs.CalculatorWithOperator;

public class Main {
    public static void main(String[] args) {
        final CalculatorWithOperator calculator1 = new CalculatorWithOperator();
//        calculator.counter1 = 0;
//        calculator.counter2 = 0;
//        calculator.counter3 = 0;

        System.out.println(calculator1.counter1);
        calculator1.counter1 = 10;
        System.out.println(calculator1.counter1);


        CalculatorWithExtends calculator2 = new CalculatorWithExtends();


        final int plus;
        plus = calculator2.plus(1, 2);
//        plus = calculator2.plus(plus, 2);

        int plus2 = calculator2.plus2(1, 2);
        System.out.println(plus);
        System.out.println(plus2);

        System.out.println(CalculatorWithOperator.def());
//        CalculatorWithOperator.plus();
        calculator2.def();
        System.out.println(CalculatorWithOperator.counter);
        CalculatorWithOperator.counter = 12;
        System.out.println(CalculatorWithOperator.counter);

    }
}
