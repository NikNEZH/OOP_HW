package HW7;

import java.util.Scanner;

public class View {

    
    private ICalculableFactory calculableFactory;
    

    public View(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }
   


    private static String promptString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private static int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
    
    // Расчет результата
    /**
     * 
     */
    public void run() {
        while (true) {
             // Ввод первого реального числа
                double real1 = promptInt("Введите первое реальное число (a): ");
            //  Ввод первого комплексного числа
                double imag1 = promptInt("Введите первое комплексное число (bi): ");
                InterfCalculable calc = calculableFactory.create(real1, imag1);

            while (true) {
                String cmd = promptString("Введите команду (*, +, /) : ");
                if (cmd.equals("+")) {
                    
                // Ввод второго реального числа
                double real2 = promptInt("Введите второе комплексное число (a): ");
                //  Ввод второго комплексного числа
                double imag2 = promptInt("Введите второе комплексное число (bi): ");
                calc.add(real2, imag2);

                int result = (int) calc.getResult();
                int resultImage = (int) calc.getResultImage();
                System.out.printf("The sum is: %d + %di\n", result,resultImage );

                break;
                }

                if (cmd.equals("*")) {
                // Ввод второго реального числа
                double real2 = promptInt("Введите второе комплексное число (a): ");
                //  Ввод второго комплексного числа
                double imag2 = promptInt("Введите второе комплексное число (bi): ");
                calc.multiply(real2, imag2);

                int result = (int) calc.getResult();
                
                int resultImage = (int) calc.getResultImage();
                System.out.printf("The  product is: %d + %di\n", result,resultImage );

                break;
                }

                if (cmd.equals("/")) {
                // Ввод второго реального числа
                double real2 = promptInt("Введите второе комплексное число (a): ");
                //  Ввод второго комплексного числа
                double imag2 = promptInt("Введите второе комплексное число (bi): ");
                calc.divide(real2, imag2);

                int result = (int) calc.getResult();
                int resultImage = (int) calc.getResultImage();
                System.out.printf("The  product is: %d + %di\n", result,resultImage );

                break;
                }
            }
            String c = promptString ("Еще посчитать (Y/N)?");
            if (c.equals("Y")) {
                continue;
            }
            break;
        }
    } 
}