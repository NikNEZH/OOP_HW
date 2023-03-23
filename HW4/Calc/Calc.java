package HW4.Calc;
import java.util.List;

public class Calc <T extends  Number> {

    public Calc() {
    }
    /**
     * метод для сумирования значений вложенного листа
     * @param items
     * @return
     */
    public Double sum (List<? extends Number> items) {
        double sum = 0;
        for (Number o : items) {
            sum += o.doubleValue();
        }
        return sum;
    }

    /**
     * метод для умножение значений вложенного листа
     * @param items
     * @return
     */
    public Double multiplication (List<? extends Number> items) {
        double mult = 0;
        double res = 1;
        for (int i = 0; i < items.size(); i++) {
            mult = res  * items.get(i).doubleValue();
            res = mult;
        }
        return res;
    }


    /**
     * метод для деления значений вложенного листа
     * @param items
     * @return
     */
    public Double division (List<? extends Number> items) {
        double division = 0;
        var res = items.get(0).doubleValue();

        for (int i = 0; i < items.size()-1; i++) {
            division = res / items.get(i+1).doubleValue();
            res = division;
        }
        return res;
    }

    public String convertToBinary(T number) {
        if (number.doubleValue() % 1 != 0) {
            return "Error: cannot convert decimal numbers to binary";
        }
        int decimal = number.intValue();
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.append(remainder);
            decimal /= 2;
        }
        return binary.reverse().toString();
    }

    public String convertToBinary(String number) {
        try {
            T value = (T) Double.valueOf(number);
            return convertToBinary(value);
        } catch (NumberFormatException e) {
            return "Error: invalid input string format";
        }
    }


}
