package HW7;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory cal = new CalFactory();
        View v = new View(cal);
        v.run();
        
        
    }
}