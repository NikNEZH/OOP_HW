package HW7;

public class CalFactory implements ICalculableFactory  {

    @Override
    public InterfCalculable create(double real1,double imag1) { return new ComplexCalc(real1,imag1);}

   
    
}
