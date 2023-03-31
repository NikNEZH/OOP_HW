package HW7;

public class ComplexCalc extends Logger  implements InterfCalculable  {
    private double firstResult;
    private double secondResult;


    // Мнимая часть
    private double imag1;
    
    // Действительная часть
    private double real1;
    
    Logger log = new Logger();
   
   
    
    // Конструкторы

    public ComplexCalc(double real1,double imag1) {
        this.imag1 = imag1;
        this.real1 = real1;
    }

    public ComplexCalc() {}

    @Override
    public ComplexCalc add(double real2, double imag2) {
        firstResult = real1 + real2;
        log.log("Log real:" + firstResult);
        secondResult = imag1 + imag2;
        log.log("Log image:" + secondResult);
        return this ;
    }

    @Override
    public ComplexCalc multiply(double real2, double imag2) {
        firstResult = real1 * real2 - imag1 * imag2;
        log.log("Log real:" + firstResult);
        secondResult = real1 * imag2 + real2 * imag1;
        log.log("Log image:" + secondResult);
        return this ;
    }

    @Override
    public ComplexCalc divide(double real2, double imag2) {
        firstResult = (real1 * real2 + imag1 * imag2) / (real2 * real2 + imag2 * imag2);
        log.log("Log real:" + firstResult);
        secondResult = (imag1 * real2 - real1 * imag2) / (real2 * real2 + imag2 * imag2);
        log.log("Log image:" + secondResult);
        return this ;
    }

    @Override
    public double getResult() {
        return   firstResult;
    }

    @Override
    public double getResultImage() {
        return   secondResult;
    }


}
