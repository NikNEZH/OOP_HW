package HW4.Calc;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        Calc<Integer> calc = new Calc<>();
//        System.out.println(calc.sum(new ArrayList<>(Arrays.asList(1,2,3,4,5))));
//
//        Calc<Double> calc1 = new Calc<>();
//        System.out.println(calc1.sum(new ArrayList<>(Arrays.asList(1.0,2.2,3.5,4.8,5.6))));

        Calc calc3 = new Calc();
        System.out.println(calc3.sum(new ArrayList<>(Arrays.asList(1.0,2.2,3.5))));

        System.out.println(calc3.multiplication(new ArrayList<>(Arrays.asList(2,5,3,4,5,10,8))));

        System.out.println(calc3.division(new ArrayList<>(Arrays.asList(80.0,10.0,2.0,2.0,5.0))));

        System.out.println(calc3.convertToBinary("5"));
    }
}
