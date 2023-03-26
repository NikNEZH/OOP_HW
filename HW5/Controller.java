package HW5;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    public static void main(String[] args) {
        TrainingGroupService us = new TrainingGroupService();

        List<String> students = new ArrayList<>();
        var lol = us.createGroup( "Бабаев Алексей Георгевичь", students,  1);

        View v = new View();
        v.listGroupView(lol);

        /**
         * Здесь я наглядно показываю один из принципов SOLID такой как принцип единственной ответственности - 
         * каждый класс должен иметь только одну зону ответственности, то есть только одну причину для изменения.
         * в данном случаи класс Person это показывает.
         * 
         * 
         * Также я использовал паттерн Декоратор - который позволяет добавлять новые функциональные возможности без изменения 
         * основного кода.
         * 
         * В основном более не вижу менять что то в этом коде только добавлять функционал через интерфейсы если надо и/или классами как 
         * это сделал я, однако стоит отметить что лучше с этим не перебарщивать так как  нарушаеться принцип простоты кода и идет перегрузка
         * приложения. 
         */
        Person p = new Person();
        p.lol("Nikita Nezhivinski", lol, 1);

        System.out.println(lol);

        // System.out.println(lol);
    }
    
    
    
}
