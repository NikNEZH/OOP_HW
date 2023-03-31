package HW7;

public interface InterfCalculable <T>  {

    /**
     * Сложение комплексных чисел
     * @param string
     * @return
     */
    T add (double real2,double imag2);

    /**
     * Умножение комплексных чисел
     * @param other
     * @return
     */
    T multiply (double real2,double imag2);


    /**
     * Деление комплексных чисел
     * @param other
     * @return
     */
    T divide (double real2,double imag2);

    /**
     * возрат результата
     * @return
     */
    public double getResult();
    public double getResultImage();
}
